package com.project.Cognify.service;


import com.project.Cognify.dto.auth.AuthResponse;
import com.project.Cognify.dto.auth.LoginRequest;
import com.project.Cognify.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
