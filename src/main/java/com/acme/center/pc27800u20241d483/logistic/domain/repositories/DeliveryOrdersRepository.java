package com.acme.center.pc27800u20241d483.logistic.domain.repositories;

import com.acme.center.pc27800u20241d483.logistic.domain.model.aggregates.DeliveryOrders;
import com.acme.center.pc27800u20241d483.logistic.domain.model.valueobjects.DeliveryCode;

import java.util.Optional;

public interface DeliveryOrdersRepository {
    Optional<DeliveryOrders> findById(Long id);
    DeliveryOrders save(DeliveryOrders deliveryOrders);
    boolean existsById(Long id);
    DeliveryOrders update(DeliveryOrders deliveryOrders);
    Optional<DeliveryOrders> findByDni(String dni);

}
