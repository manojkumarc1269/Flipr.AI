package com.project.purchaseOrder.controller;

import com.project.purchaseOrder.beans.PurchaseOrder;
import com.project.purchaseOrder.services.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PurchaseOrderController {
    @Autowired
    private PurchaseOrderService service;

    @PostMapping("/setPurchaseOrderDetails")
    public String setPurchaseOrderDetails(@RequestBody PurchaseOrder purchaseOrder){

        if(service.addPurchaseOrderDetails(purchaseOrder)==null){
            return "pricing can't be greater than MRP";
        }
        else {
            return "successfully done";
        }
    }

    @GetMapping("/getPurchaseOrderDetails/{Id}")
    public PurchaseOrder getPurchaseOrderDetails(@PathVariable int id){
        return service.getPurchaseOrderDetails(id);
    }
}
