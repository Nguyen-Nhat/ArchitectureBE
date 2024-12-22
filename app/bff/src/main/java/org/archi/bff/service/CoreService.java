package org.archi.bff.service;

import lombok.RequiredArgsConstructor;
import org.archi.bff.adapter.CoreAdapter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoreService {
    private final CoreAdapter coreAdapter;
}
