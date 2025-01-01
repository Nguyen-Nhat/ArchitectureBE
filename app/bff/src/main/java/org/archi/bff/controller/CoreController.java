package org.archi.bff.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/core")
@RequiredArgsConstructor
public class CoreController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CoreController.class);

    @GetMapping("/todo")
    public ResponseEntity<String> getTodo() {
        // TODO: test otel, delete it
        LOGGER.info("nhat.ntm");
        return ResponseEntity.ok("hello");
    }

    @PreAuthorize("hasRole('BRAND')")
    @GetMapping(value = "/users/brand-info")
    public ResponseEntity<String> getBrandInfo(Authentication authentication) {
        return ResponseEntity.ok("brand info");
    }

    @PreAuthorize("hasRole('PLAYER')")
    @GetMapping(value = "/users/player-info")
    public ResponseEntity<String> getPlayerInfo() {
        return ResponseEntity.ok("player info");
    }
}
