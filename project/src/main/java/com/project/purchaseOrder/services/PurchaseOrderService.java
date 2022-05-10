package com.project.purchaseOrder.services;

import com.project.purchaseOrder.beans.PurchaseOrder;
import com.project.purchaseOrder.repository.PurchaseOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class PurchaseOrderService {

    @Autowired
    private PurchaseOrderRepo repo;

    public PurchaseOrder addPurchaseOrderDetails(@RequestBody PurchaseOrder purchaseOrder){
       if(purchaseOrder.getMRP() <= purchaseOrder.getPricing()) {
          return repo.save(purchaseOrder);
       }
       else {
           return null;
       }
    }

    public PurchaseOrder getPurchaseOrderDetails(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }
}
