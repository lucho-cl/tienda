package cl.tcgplanet.service;

import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tcgplanet.domain.PurchaseOrder;
import cl.tcgplanet.persistence.PurchaseOrderMapper;

@Service("purchaseOrderService")
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

	@Autowired
	PurchaseOrderMapper purchaseOrderMapper;
	
	public PurchaseOrder getPurchaseOrder(PurchaseOrder purchaseOrder) {
		return purchaseOrderMapper.getPurchaseOrder(purchaseOrder);
	}

	public List<PurchaseOrder> getAllPurchaseOrders() {
		return purchaseOrderMapper.getAllPurchaseOrders();
	}
	
	public List<PurchaseOrder> getPurchaseOrders(PurchaseOrder po) {
		return purchaseOrderMapper.getPurchaseOrders(po);
	}

	public void insertPurchaseOrder(PurchaseOrder purchaseOrder) {
		setOrderCode(purchaseOrder);
		purchaseOrder.getStatus().setLabel("1");
		purchaseOrderMapper.insertPurchaseOrder(purchaseOrder);
	}

	public void updatePurchaseOrder(PurchaseOrder purchaseOrder) {
		purchaseOrderMapper.updatePurchaseOrder(purchaseOrder);
	}

	public void deletePurchaseOrder(PurchaseOrder purchaseOrder) {
//		se setea el estado según el valor para el estado no válido o inhabilitado
		purchaseOrder.getStatus().setLabel("-1");
		purchaseOrderMapper.deletePurchaseOrder(purchaseOrder);
	}

	@Override
	public String getNextOrderCode(String code) {
		String next = purchaseOrderMapper.getNextOrderCode(code);
		if(!next.isEmpty()){
			int i = 4-next.length();
			for (int j = 0; j < i; j++) {
				next = "0".concat(next);
			}
		}
		return next;
	}

	private void setOrderCode(PurchaseOrder order) {
		StringBuffer code = new StringBuffer();
		code.append("TCG");
		code.append(order.getCity());
		// code.append(order.getCloseDate().getYear());
		// code.append(order.getCloseDate().getMonthValue());
		// code.append(order.getCloseDate().getDayOfMonth());
		code.append(order.getCloseDate().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
		code.append(getNextOrderCode(code.toString()));
		order.setCode(code.toString());
	}

}
