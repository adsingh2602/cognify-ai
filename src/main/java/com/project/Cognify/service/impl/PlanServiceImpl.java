package com.project.Cognify.service.impl;

import com.project.Cognify.dto.subscription.PlanResponse;
import com.project.Cognify.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
