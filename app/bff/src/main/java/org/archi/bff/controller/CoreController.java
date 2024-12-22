package org.archi.bff.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
