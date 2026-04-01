package com.project.Cognify.service;


import com.project.Cognify.dto.project.ProjectRequest;
import com.project.Cognify.dto.project.ProjectResponse;
import com.project.Cognify.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects();

    ProjectResponse getUserProjectById(Long id);

    ProjectResponse createProject(ProjectRequest request);

    ProjectResponse updateProject(Long id, ProjectRequest request);

    void softDelete(Long id);
}
