package com.acme.center.pc27800u20241d483.logistic.application.commandservices;

import com.acme.center.pc27800u20241d483.logistic.domain.model.valueobjects.DeliveryCode;
import com.acme.center.pc27800u20241d483.logistic.application.commands.CreateDeliveryOrdersCommand;

public interface DeliveryOrdersCommandService {
    DeliveryCode handle(CreateDeliveryOrdersCommand command)
}
