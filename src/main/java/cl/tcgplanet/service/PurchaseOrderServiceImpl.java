package cl.tcgplanet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.tcgplanet.domain.PurchaseOrder;
import cl.tcgplanet.persistence.PurchaseOrderMapper;

public class PurchaseOrderServiceImpl implements PurchaseOrderService {

	@Autowired
	PurchaseOrderMapper purchaseOrderMapper;
	
	public PurchaseOrder getPurchaseOrder(PurchaseOrder purchaseOrder) {
		return purchaseOrderMapper.getPurchaseOrder(purchaseOrder);
	}

	public List<PurchaseOrder> getAllPurchaseOrders() {
		return purchaseOrderMapper.getAllPurchaseOrders();
	}

	public void insertPurchaseOrder(PurchaseOrder purchaseOrder) {
		purchaseOrderMapper.insertPurchaseOrder(purchaseOrder);
	}

	public void updatePurchaseOrder(PurchaseOrder purchaseOrder) {
		purchaseOrderMapper.updatePurchaseOrder(purchaseOrder);
	}

	public void deletePurchaseOrder(PurchaseOrder purchaseOrder) {
		purchaseOrderMapper.deletePurchaseOrder(purchaseOrder);
	}

}
