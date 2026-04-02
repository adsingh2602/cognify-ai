package com.project.Cognify.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ProjectPermission {

    VIEW("project:view"),
    EDIT("project:edit"),
    DELETE("project:delete"),

    MANAGE_MEMBERS("projects_members:manage"),
    VIEW_MEMBERS("project_members:view");

    private final String value;
}
