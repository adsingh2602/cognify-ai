package com.project.Cognify.mapper;

import com.project.Cognify.dto.subscription.PlanResponse;
import com.project.Cognify.dto.subscription.SubscriptionResponse;
import com.project.Cognify.entity.Plan;
import com.project.Cognify.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse(Plan plan);
}
