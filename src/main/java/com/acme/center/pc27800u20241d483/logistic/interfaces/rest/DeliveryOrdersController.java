package com.acme.center.pc27800u20241d483.logistic.interfaces.rest;


import com.acme.center.pc27800u20241d483.logistic.application.commandservices.DeliveryOrdersCommandService;
import com.acme.center.pc27800u20241d483.logistic.domain.model.aggregates.DeliveryOrders;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/delivery-orders")
public class DeliveryOrdersController {
    private final DeliveryOrdersCommandService service;

    public DeliveryOrdersController(this ) {
        ;
    }

    @PostMapping
    public ResponseEntity<CustomerRequestResponse> createCustomer(
            @Valid @RequestBody CustomerRequestResource customerRequestResource){
        var result = service.handle(CustomerTranform.toCreateCustomerCommandFromResource(customerRequestResource));
        var resultTransact = DeliveryOrdersTranform.toCustomerRequestResponseFromDomain(result);
        return  ResponseEntity.ok().body(resultTransact);
    }
}
