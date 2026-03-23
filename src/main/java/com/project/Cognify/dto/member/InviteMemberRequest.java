package com.project.Cognify.dto.member;


import com.project.Cognify.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
