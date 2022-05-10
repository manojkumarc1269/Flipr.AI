package com.project.purchaseOrder.repository;

import com.project.purchaseOrder.beans.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepo extends JpaRepository<PurchaseOrder,Integer> {
}
