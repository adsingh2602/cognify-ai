package com.project.Cognify.service.impl;

import com.project.Cognify.dto.subscription.PlanLimitsResponse;
import com.project.Cognify.dto.subscription.UsageTodayResponse;
import com.project.Cognify.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
