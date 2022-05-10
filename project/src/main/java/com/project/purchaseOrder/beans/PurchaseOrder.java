package com.project.purchaseOrder.beans;

import com.project.addCustomer.beans.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PurchaseOrder {
    private String productName;
    private int quantity;
    private double pricing;
    private double MRP;
    private int purchaseOrderId;
    private Customer customer;
}
