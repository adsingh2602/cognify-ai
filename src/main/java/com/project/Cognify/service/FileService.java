package com.project.Cognify.service;



import com.project.Cognify.dto.project.FileContentResponse;
import com.project.Cognify.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
