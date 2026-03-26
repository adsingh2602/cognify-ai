package com.project.Cognify.service.impl;

import com.project.Cognify.dto.auth.UserProfileResponse;
import com.project.Cognify.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
