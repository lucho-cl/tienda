package cl.tcgplanet.service;

import java.util.List;

import cl.tcgplanet.domain.PurchaseOrderDetail;

public interface PurchaseOrderDetailService {
    public PurchaseOrderDetail getPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail);
    
    public List<PurchaseOrderDetail> getAllPurchaseOrderDetails();
    
    public List<PurchaseOrderDetail> getPurchaseOrderDetails(PurchaseOrderDetail purchaseOrderDetail);

    public void insertPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail);

    public void updatePurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail);
    
    public void deletePurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail);
}
