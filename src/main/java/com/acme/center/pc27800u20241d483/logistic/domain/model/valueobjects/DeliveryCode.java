package com.acme.center.pc27800u20241d483.logistic.domain.model.valueobjects;

public record DeliveryCode(String value) {
    public DeliveryCode{
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("The error is location");
        }
    }
}
