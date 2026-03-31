package com.project.Cognify.mapper;

import com.project.Cognify.dto.auth.SignupRequest;
import com.project.Cognify.dto.auth.UserProfileResponse;
import com.project.Cognify.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);

}
