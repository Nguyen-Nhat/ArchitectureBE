package org.archi.bff.service;

import lombok.RequiredArgsConstructor;
import org.archi.bff.adapter.AuthAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthAdapter adapter;
}
