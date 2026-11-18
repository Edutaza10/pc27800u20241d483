package com.acme.center.platform.sales.application.commands;

public record CreateDeliveryOrdersCommand(
        String deliveryCode,
        String warehoseId,
        String deliveryWindow,
        String PackageLoad,
        int priorityLevel ,
        String status ,
        String deliveryNotes
) {
}