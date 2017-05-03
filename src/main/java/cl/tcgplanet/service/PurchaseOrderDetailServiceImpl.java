package cl.tcgplanet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.tcgplanet.domain.PurchaseOrderDetail;
import cl.tcgplanet.persistence.PurchaseOrderDetailMapper;

public class PurchaseOrderDetailServiceImpl implements PurchaseOrderDetailService {

	@Autowired
	PurchaseOrderDetailMapper purchaseOrderDetailMapper;
	
	public PurchaseOrderDetail getPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
		return purchaseOrderDetailMapper.getPurchaseOrderDetail(purchaseOrderDetail);
	}

	public List<PurchaseOrderDetail> getAllPurchaseOrderDetails() {
		return purchaseOrderDetailMapper.getAllPurchaseOrderDetails();
	}

	public void insertPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
		purchaseOrderDetailMapper.insertPurchaseOrderDetail(purchaseOrderDetail);
	}

	public void updatePurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
		purchaseOrderDetailMapper.updatePurchaseOrderDetail(purchaseOrderDetail);
	}

	public void deletePurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
		purchaseOrderDetailMapper.deletePurchaseOrderDetail(purchaseOrderDetail);
	}

}
