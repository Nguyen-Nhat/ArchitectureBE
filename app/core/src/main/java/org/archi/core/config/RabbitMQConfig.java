package org.archi.core.config;

import org.springframework.amqp.core.*;
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
    public DirectExchange quizScheduleExchange() {
        return new DirectExchange("quiz.schedule.exchange");
    }

    @Bean
    public Queue quizScheduleQueue() {
        return new Queue("quiz.schedule.queue");
    }

    @Bean
    public Binding bindingQuizSchedule(Queue quizScheduleQueue, DirectExchange quizScheduleExchange) {
        return BindingBuilder.bind(quizScheduleQueue).to(quizScheduleExchange).with("quiz.schedule");
    }


    @Bean
    public DirectExchange quizNewPlayerExchange() {
        return new DirectExchange("quiz.newplayer.exchange");
    }

    @Bean
    public Queue quizNewPlayerQueue() {
        return new Queue("quiz.newplayer.queue");
    }

    @Bean
    public Binding bindingQuizNewPlayer(Queue quizNewPlayerQueue, DirectExchange quizNewPlayerExchange) {
        return BindingBuilder.bind(quizNewPlayerQueue).to(quizNewPlayerExchange).with("quiz.newplayer");
    }


    @Bean
    public DirectExchange quizLeftPlayerExchange() {
        return new DirectExchange("quiz.leftplayer.exchange");
    }

    @Bean
    public Queue quizLeftPlayerQueue() {
        return new Queue("quiz.leftplayer.queue");
    }

    @Bean
    public Binding bindingQuizLeftPlayer(Queue quizLeftPlayerQueue, DirectExchange quizLeftPlayerExchange) {
        return BindingBuilder.bind(quizLeftPlayerQueue).to(quizLeftPlayerExchange).with("quiz.leftplayer");
    }


    @Bean
    public DirectExchange quizPlayerAnswerExchange() {
        return new DirectExchange("quiz.playeranswer.exchange");
    }

    @Bean
    public Queue quizPlayerAnswerQueue() {
        return new Queue("quiz.playeranswer.queue");
    }

    @Bean
    public Binding bindingQuizPlayerAnswer(Queue quizPlayerAnswerQueue, DirectExchange quizPlayerAnswerExchange) {
        return BindingBuilder.bind(quizPlayerAnswerQueue).to(quizPlayerAnswerExchange).with("quiz.playeranswer");
    }
}

