package cl.tcgplanet.service;

import java.util.List;

import cl.tcgplanet.domain.PurchaseOrder;

public interface PurchaseOrderService {
    public PurchaseOrder getPurchaseOrder(PurchaseOrder purchaseOrder);
    
    public List<PurchaseOrder> getAllPurchaseOrders();

    public void insertPurchaseOrder(PurchaseOrder purchaseOrder);

    public void updatePurchaseOrder(PurchaseOrder purchaseOrder);
    
    public void deletePurchaseOrder(PurchaseOrder purchaseOrder);
}
