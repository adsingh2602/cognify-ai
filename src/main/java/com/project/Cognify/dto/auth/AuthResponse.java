package com.project.Cognify.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
