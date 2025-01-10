package org.archi.bff.websocket;

import lombok.RequiredArgsConstructor;
import org.archi.bff.response.PlayerInfo;
import org.archi.bff.response.ResponseData;
import org.archi.bff.service.AuthService;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;


@RequiredArgsConstructor
public class AuthHandshakeInterceptor implements HandshakeInterceptor {
    private final AuthService authService;

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response,
                                   WebSocketHandler wsHandler, Map<String, Object> attributes) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            return false;
        }

        if (!authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_PLAYER"))) {
            return false;
        }

        String accountId = authentication.getName();
        ResponseData responseData = authService.getPlayerProfile(Long.parseLong(accountId));
        long playerId = ((PlayerInfo) responseData.getData()).getId();
        attributes.put("playerId", playerId);

        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response,
                               WebSocketHandler wsHandler, Exception exception) {
    }
}

