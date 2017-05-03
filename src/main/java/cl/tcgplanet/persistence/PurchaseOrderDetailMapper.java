package cl.tcgplanet.persistence;

import java.util.List;

import cl.tcgplanet.domain.PurchaseOrderDetail;

public interface PurchaseOrderDetailMapper {

    public PurchaseOrderDetail getPurchaseOrderDetail(PurchaseOrderDetail pod);
    
    public List<PurchaseOrderDetail> getAllPurchaseOrderDetails();

    public void insertPurchaseOrderDetail(PurchaseOrderDetail pod);

    public void updatePurchaseOrderDetail(PurchaseOrderDetail pod);
    
    public void deletePurchaseOrderDetail(PurchaseOrderDetail pod);
}
