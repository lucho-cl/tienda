package cl.tcgplanet.service;

import java.util.List;

import cl.tcgplanet.domain.PurchaseOrder;

public interface PurchaseOrderService {
    public PurchaseOrder getPurchaseOrder(PurchaseOrder po);
    
    public List<PurchaseOrder> getAllPurchaseOrders();

    public List<PurchaseOrder> getPurchaseOrders(PurchaseOrder po);

    public void insertPurchaseOrder(PurchaseOrder po);

    public void updatePurchaseOrder(PurchaseOrder po);
    
    public void deletePurchaseOrder(PurchaseOrder po);

	public String getNextOrderCode(String string);
}
