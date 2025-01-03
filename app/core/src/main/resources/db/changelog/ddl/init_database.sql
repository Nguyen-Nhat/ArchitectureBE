--- Campaign ---
CREATE TABLE IF NOT EXISTS campaign (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    image_url VARCHAR(255),
    description VARCHAR(255),
    start_date VARCHAR(255),
    end_date VARCHAR(255),
    status VARCHAR(255)
);

--- Voucher Type ---
CREATE TABLE IF NOT EXISTS voucher_type (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    value DOUBLE PRECISION NOT NULL,
    image VARCHAR(255),
    description VARCHAR(255),
    brand_id BIGINT
);

--- Voucher ---
CREATE TABLE IF NOT EXISTS voucher (
    id BIGSERIAL PRIMARY KEY,
    issued_at TIMESTAMP NOT NULL,
    expired_date TIMESTAMP NOT NULL,
    status VARCHAR(255),
    qr_code VARCHAR(255) UNIQUE,
    player_id BIGINT, --- owner of generated voucher ---
    voucher_type_id BIGINT NOT NULL,
    CONSTRAINT fk_voucher_type FOREIGN KEY (voucher_type_id) REFERENCES voucher_type (id)
);

--- Payment ---
CREATE TABLE IF NOT EXISTS payment (
    brand_id BIGINT NOT NULL,
    campaign_id BIGINT NOT NULL,
    amount DOUBLE PRECISION NOT NULL,
    payment_date TIMESTAMP NOT NULL,
    status VARCHAR(255),
    PRIMARY KEY (brand_id, campaign_id),
    CONSTRAINT fk_campaign_id FOREIGN KEY (campaign_id) REFERENCES campaign (id)
);