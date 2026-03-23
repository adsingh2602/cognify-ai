package com.project.Cognify.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
