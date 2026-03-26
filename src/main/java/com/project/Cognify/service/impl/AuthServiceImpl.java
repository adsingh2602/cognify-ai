package com.project.Cognify.service.impl;

import com.project.Cognify.dto.auth.AuthResponse;
import com.project.Cognify.dto.auth.LoginRequest;
import com.project.Cognify.dto.auth.SignupRequest;
import com.project.Cognify.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
