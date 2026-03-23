package com.project.Cognify.service;

import com.project.Cognify.dto.subscription.PlanLimitsResponse;
import com.project.Cognify.dto.subscription.UsageTodayResponse;

public interface UsageService {
     UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
