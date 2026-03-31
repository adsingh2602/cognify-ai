package com.project.Cognify.service.impl;

import com.project.Cognify.dto.auth.AuthResponse;
import com.project.Cognify.dto.auth.LoginRequest;
import com.project.Cognify.dto.auth.SignupRequest;
import com.project.Cognify.entity.User;
import com.project.Cognify.error.BadRequestException;
import com.project.Cognify.mapper.UserMapper;
import com.project.Cognify.repository.UserRepository;
import com.project.Cognify.service.AuthService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthServiceImpl implements AuthService {

    UserRepository userRepository;
    UserMapper userMapper;
    PasswordEncoder passwordEncoder;

    @Override
    public AuthResponse signup(SignupRequest request) {
        userRepository.findByusername(request.username())
                .ifPresent(user -> {
                    throw new BadRequestException("User already exists with username: " + request.username());
                });

        User user = userMapper.toEntity(request);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user = userRepository.save(user);

        return new AuthResponse("dummy",userMapper.toUserProfileResponse(user));
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
