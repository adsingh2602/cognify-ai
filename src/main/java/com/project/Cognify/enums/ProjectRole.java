package com.project.Cognify.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

import static com.project.Cognify.enums.ProjectPermission.*;

@RequiredArgsConstructor
@Getter
public enum ProjectRole {
    EDITOR(VIEW, EDIT, DELETE),
    VIEWER(VIEW),
    OWNER(VIEW, EDIT, DELETE, MANAGE_MEMBERS);

    ProjectRole(ProjectPermission... permissions) {
        this.permissions = Set.of(permissions);
    }

    private final Set<ProjectPermission> permissions;
}
