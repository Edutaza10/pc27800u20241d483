package com.acme.center.pc27800u20241d483.logistic.application.internal.commandservices;


import com.acme.center.pc27800u20241d483.logistic.domain.model.aggregates.DeliveryOrders;
import com.acme.center.pc27800u20241d483.logistic.domain.model.valueobjects.DeliveryCode;
import org.springframework.stereotype.Service;

@Service
public class DeliveryOrdersCommandServiceImpl {
    private final DeliveryOrdersRepository repository;

    public CustomerCommandServiceImpl(DeliveryOrdersRepository repository) {
        this.repository = repository;
    }

}
