package org.archi.core.mapper;

import org.archi.common.quiz.QuizCorrectAnswerDTO;
import org.archi.common.quiz.QuizQuestionDTO;
import org.archi.core.entity.quiz.QuizQuestion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface QuizMapper {
    QuizMapper INSTANCE = Mappers.getMapper(QuizMapper.class);

    @Mapping(source = "quizQuestion.questionNumber", target = "questionNumber")
    @Mapping(source = "quizQuestion.questionTitle", target = "questionTitle")
    @Mapping(source = "quizQuestion.questionContent", target = "questionContent")
    @Mapping(source = "quizQuestion.answerA", target = "answerA")
    @Mapping(source = "quizQuestion.answerB", target = "answerB")
    @Mapping(source = "quizQuestion.answerC", target = "answerC")
    @Mapping(source = "quizQuestion.answerD", target = "answerD")
    QuizQuestionDTO toQuizQuestionDTO(QuizQuestion quizQuestion);

    @Mapping(source = "quizQuestion.correctAnswer", target = "correctAnswer")
    @Mapping(source = "quizQuestion.answerExplanation", target = "answerExplanation")
    QuizCorrectAnswerDTO toQuizAnswerDTO(QuizQuestion quizQuestion);
}

