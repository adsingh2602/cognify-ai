package com.project.Cognify.service.impl;

import com.project.Cognify.dto.subscription.CheckoutRequest;
import com.project.Cognify.dto.subscription.CheckoutResponse;
import com.project.Cognify.dto.subscription.PortalResponse;
import com.project.Cognify.dto.subscription.SubscriptionResponse;
import com.project.Cognify.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
