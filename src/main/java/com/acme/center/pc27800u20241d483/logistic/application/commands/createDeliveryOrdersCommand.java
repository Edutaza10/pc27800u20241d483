package com.acme.center.platform.sales.application.commands;
import com.acme.center.pc27800u20241d483.logistic.domain.model.valueobjects.DeliveryCode;

public record CreateDeliveryOrdersCommand(
        String DeliveryCode,
        String WarehoseId,
        String DeliveryWindow,
        String PackageLoad,
        int priorityLevel ,
        boolean DeliveryStatus ,
        String DeliveryNotes
) {
}