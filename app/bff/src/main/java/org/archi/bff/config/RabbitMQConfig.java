package org.archi.bff.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory, Jackson2JsonMessageConverter messageConverter) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter);
        return rabbitTemplate;
    }


    @Bean
    public FanoutExchange quizOpenExchange() {
        return new FanoutExchange("quiz.open.exchange");
    }

    @Bean
    public Queue quizOpenQueue() {
        return new Queue("quiz.open.queue");
    }

    @Bean
    public Binding bindingQuizOpen(Queue quizOpenQueue, FanoutExchange quizOpenExchange) {
        return BindingBuilder.bind(quizOpenQueue).to(quizOpenExchange);
    }


    @Bean
    public FanoutExchange quizStartExchange() {
        return new FanoutExchange("quiz.start.exchange");
    }

    @Bean
    public Queue quizStartQueue() {
        return new Queue("quiz.start.queue");
    }

    @Bean
    public Binding bindingQuizStart(Queue quizStartQueue, FanoutExchange quizStartExchange) {
        return BindingBuilder.bind(quizStartQueue).to(quizStartExchange);
    }


    @Bean
    public FanoutExchange quizQuestionExchange() {
        return new FanoutExchange("quiz.question.exchange");
    }

    @Bean
    public Queue quizQuestionQueue() {
        return new Queue("quiz.question.queue");
    }

    @Bean
    public Binding bindingQuizQuestion(Queue quizQuestionQueue, FanoutExchange quizQuestionExchange) {
        return BindingBuilder.bind(quizQuestionQueue).to(quizQuestionExchange);
    }


    @Bean
    public FanoutExchange quizAnswerExchange() {
        return new FanoutExchange("quiz.answer.exchange");
    }

    @Bean
    public Queue quizAnswerQueue() {
        return new Queue("quiz.answer.queue");
    }

    @Bean
    public Binding bindingQuizAnswer(Queue quizAnswerQueue, FanoutExchange quizAnswerExchange) {
        return BindingBuilder.bind(quizAnswerQueue).to(quizAnswerExchange);
    }


    @Bean
    public FanoutExchange quizResultExchange() {
        return new FanoutExchange("quiz.result.exchange");
    }

    @Bean
    public Queue quizResultQueue() {
        return new Queue("quiz.result.queue");
    }

    @Bean
    public Binding bindingQuizResult(Queue quizResultQueue, FanoutExchange quizResultExchange) {
        return BindingBuilder.bind(quizResultQueue).to(quizResultExchange);
    }
}
