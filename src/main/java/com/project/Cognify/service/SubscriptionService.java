package com.project.Cognify.service;

import com.project.Cognify.dto.subscription.CheckoutRequest;
import com.project.Cognify.dto.subscription.CheckoutResponse;
import com.project.Cognify.dto.subscription.PortalResponse;
import com.project.Cognify.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
