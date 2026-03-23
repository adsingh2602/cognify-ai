package com.project.Cognify.service;

import com.project.Cognify.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
