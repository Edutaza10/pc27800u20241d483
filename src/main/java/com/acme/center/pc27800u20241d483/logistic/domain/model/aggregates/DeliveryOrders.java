package com.acme.center.pc27800u20241d483.logistic.domain.model.aggregates;

import com.acme.center.pc27800u20241d483.logistic.domain.model.valueobjects.*;

public class DeliveryOrders {
    private Long id;
    private DeliveryCode deliveryCode;
    private WarehoseId warehoseId;
    private DeliveryWindow deliveryWindow;
    private PackageLoad PackageLoad;
    private int priorityLevel ;
    private DeliveryStatus status ;
    private String deliveryNotes;

    private DeliveryOrders(Long id,
                           DeliveryCode deliveryCode,
                           WarehoseId warehoseId,
                           DeliveryWindow deliveryWindow,
                           PackageLoad packageLoad,
                           int priorityLevel,
                           DeliveryStatus status,
                           String deliveryNotes){
        this.id=id;
        this.deliveryCode=deliveryCode;
        this.warehoseId=warehoseId;
        this.deliveryWindow = deliveryWindow;
        this.PackageLoad = packageLoad;
        this.priorityLevel=priorityLevel;
        this.status=status;
        this.deliveryNotes=deliveryNotes;
    }


    public Long getId() {
        return id;
    }

    public DeliveryCode getdeliveryCode() {
        return deliveryCode;
    }
    public WarehoseId getwarehoseId() {
        return warehoseId;
    }
    public DeliveryWindow getDeliveryWindow() {
        return deliveryWindow;
    }
    public PackageLoad getPackageLoad() {
        return PackageLoad;
    }
    public int getpriorityLevel() {
        return priorityLevel;
    }
    public DeliveryStatus getstatus() {
        return status;
    }
    public String getsdeliveryNotes(){
        return deliveryNotes;
    }





}
