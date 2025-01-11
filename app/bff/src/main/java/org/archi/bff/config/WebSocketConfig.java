package org.archi.bff.config;

import lombok.RequiredArgsConstructor;
import org.archi.bff.service.AuthService;
import org.archi.bff.websocket.AuthHandshakeInterceptor;
import org.archi.bff.websocket.QuizWebSocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@RequiredArgsConstructor
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    private final AuthService authService;
    private final QuizWebSocketHandler quizWebSocketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(quizWebSocketHandler, "/quiz")
                .addInterceptors(new AuthHandshakeInterceptor(authService))
                .setAllowedOrigins("*");
    }
}
