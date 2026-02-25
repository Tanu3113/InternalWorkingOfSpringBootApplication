package com.codingshuttle.working.internalWorkingOfSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "stripe")
public class StripePaymentServices implements PaymentServices{
    @Override
    public String pay() {
        String payment = "Stripe Payment";
        System.out.println("Payment from: "+payment);
        return payment;
    }
}
