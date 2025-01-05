-- changeset tthuytruc:001

-- 1. replace by real table created by Quoc later --
CREATE TABLE piece (
    piece_id BIGSERIAL PRIMARY KEY,
    image_url TEXT NOT NULL
);

INSERT INTO campaign (name)
VALUES
    ('Campaign name 01'),
    ('Campaign name 02'),
    ('Campaign name 03');

INSERT INTO voucher_type (name, value, image, description, brand_id)
VALUES
    ('voucher_type_1', 50, 'image1', 'description1',3),
    ('voucher_type_2', 20, 'image2', 'description2', 1);

INSERT INTO voucher (issued_at, expired_date, status, qr_code, player_id, voucher_type_id)
VALUES
    ('2025-01-01 18:00:00', '2025-01-01 18:00:00', 'status1', 'qr_code1', 32, 2),
    ('2025-01-01 18:00:00','2025-01-01 18:00:00', 'status2', 'qr_code2', 19, 2),
    ('2025-01-01 18:00:00','2025-01-01 18:00:00', 'status3', 'qr_code3', 32,1);

INSERT INTO piece (image_url)
VALUES
    ('/piece01image.png'),
    ('/piece02image.png'),
    ('/piece03image.png');


---- 2. schema ----
CREATE TABLE game_type (
    type_id SERIAL PRIMARY KEY,
    type_name VARCHAR(50) NOT NULL,
    is_realtime BOOLEAN NOT NULL DEFAULT FALSE,
    image_url TEXT,
    instruction TEXT
);

CREATE TABLE game (
    game_id BIGSERIAL PRIMARY KEY,
    allow_pieces_exchange BOOLEAN NOT NULL DEFAULT TRUE,
    start_at TIMESTAMP, -- for realtime games
    type_id INTEGER NOT NULL,
    campaign_id BIGINT NOT NULL,

	CONSTRAINT fk_game_gametype FOREIGN KEY (type_id) REFERENCES game_type(type_id),
	CONSTRAINT fk_game_campaign FOREIGN KEY (campaign_id) REFERENCES campaign(id)
);

CREATE TABLE game_player (
    gameplayer_id BIGSERIAL PRIMARY KEY,
    game_id BIGINT,
    player_id BIGINT,
    played_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

	CONSTRAINT fk_gameplayer_game FOREIGN KEY (game_id) REFERENCES game(game_id)
);

CREATE TABLE quiz_player (
    gameplayer_id BIGINT PRIMARY KEY,
    total_score INTEGER NOT NULL,
    total_time NUMERIC(10, 3) NOT NULL,

    CONSTRAINT fk_quizplayer_gameplayer FOREIGN KEY (gameplayer_id) REFERENCES game_player(gameplayer_id)
);

CREATE TABLE quiz_question (
    question_id BIGSERIAL PRIMARY KEY,
    game_id BIGINT NOT NULL,
    question_number INTEGER NOT NULL,
    question_title TEXT NOT NULL,
    question_content TEXT,
    answer_a TEXT NOT NULL,
    answer_b TEXT NOT NULL,
    answer_c TEXT NOT NULL,
    answer_d TEXT NOT NULL,
    correct_answer CHAR(1) NOT NULL CHECK (correct_answer IN ('A', 'B', 'C', 'D')),
    answer_explanation TEXT,

    CONSTRAINT fk_quizquestion_game FOREIGN KEY (game_id) REFERENCES game(game_id),
    UNIQUE (game_id, question_number)
);


---- 3. data ----
INSERT INTO game_type (type_name, is_realtime, image_url, instruction)
VALUES
    ('Realtime Quiz', TRUE, '/quiz.png', 'Trong vòng 5 phút trước khi đến thời gian bắt đầu trò chơi, bạn có thể tham gia vào phòng chờ. Khi trò chơi bắt đầu, chọn đáp án đúng trong 4 đáp án cho từng câu hỏi trắc nghiệm xuất hiện trên màn hình. Mỗi câu hỏi có thời gian trả lời tối đa là 10 giây. Khi kết thúc trò chơi, top 3 người chơi có tổng điểm cao nhất sẽ nhận được voucher khuyến mãi hoặc mảnh ghép. Nếu nhiều người chơi có tổng điểm bằng nhau, người chơi có tổng thời gian trả lời nhỏ hơn sẽ được ưu tiên.'),
    ('Shake', FALSE, '/shake.png', 'Lắc điện thoại để có khả năng nhận voucher khuyến mãi hoặc mảnh ghép.');


-- 4. just for testing, delete later --
INSERT INTO game (start_at, type_id, campaign_id)
VALUES
    ('2025-01-01 18:00:00', 1, 1),
    (NULL, 2, 1),
    (NULL, 2, 2),
    ('2025-01-01 18:01:00', 1, 2),
    ('2025-01-01 18:02:00', 1, 3);

INSERT INTO quiz_question (game_id, question_number, question_title, question_content, answer_a, answer_b, answer_c, answer_d, correct_answer, answer_explanation)
VALUES
    ('1', 1, 'Question title 1 (game 1)', 'Question content 1 (game 1)', 'Answer A', 'Answer B', 'Answer C', 'Answer D', 'B', 'Answer explanation 1 (game 1)'),
    ('1', 3, 'Question title 3 (game 1)', 'Question content 3 (game 1)', 'Answer A', 'Answer B', 'Answer C', 'Answer D', 'C', 'Answer explanation 3 (game 1)'),
    ('1', 5, 'Question title 5 (game 1)', 'Question content 5 (game 1)', 'Answer A', 'Answer B', 'Answer C', 'Answer D', 'C', 'Answer explanation 5 (game 1)'),
    ('1', 2, 'Question title 2 (game 1)', 'Question content 2 (game 1)', 'Answer A', 'Answer B', 'Answer C', 'Answer D', 'A', 'Answer explanation 2 (game 1)'),
    ('1', 4, 'Question title 4 (game 1)', 'Question content 4 (game 1)', 'Answer A', 'Answer B', 'Answer C', 'Answer D', 'D', 'Answer explanation 4 (game 1)'),

    ('4', 3, 'Question title 3 (game 4)', 'Question content 3 (game 4)', 'Answer A', 'Answer B', 'Answer C', 'Answer D', 'C', 'Answer explanation 3 (game 4)'),
    ('4', 1, 'Question title 1 (game 4)', 'Question content 1 (game 4)', 'Answer A', 'Answer B', 'Answer C', 'Answer D', 'D', 'Answer explanation 1 (game 4)'),
    ('4', 4, 'Question title 4 (game 4)', 'Question content 4 (game 4)', 'Answer A', 'Answer B', 'Answer C', 'Answer D', 'A', 'Answer explanation 4 (game 4)'),
    ('4', 2, 'Question title 2 (game 4)', 'Question content 2 (game 4)', 'Answer A', 'Answer B', 'Answer C', 'Answer D', 'B', 'Answer explanation 2 (game 4)');
