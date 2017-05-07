package cl.tcgplanet.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import cl.tcgplanet.domain.PurchaseOrderDetail;
import cl.tcgplanet.service.PurchaseOrderDetailService;

@ManagedBean
@ViewScoped
public class PurchaseOrderDetailBean {

	@ManagedProperty("#{purchaseOrderDetailService}")
	private PurchaseOrderDetailService purchaseOrderDetailService;

	private List<PurchaseOrderDetail> orderDetails;
	private List<PurchaseOrderDetail> selectedOrderDetails;

	private PurchaseOrderDetail orderDetail;
	private PurchaseOrderDetail newOrderDetail;

	@PostConstruct
	public void init() {
	}
	
	public void getDetails(){
		orderDetails = purchaseOrderDetailService.getAllPurchaseOrderDetails();
	}

	public void addOrderDetail() {
		purchaseOrderDetailService.insertPurchaseOrderDetail(getNewOrderDetail());
	}

	public void modifyOrderDetail() {
		purchaseOrderDetailService.updatePurchaseOrderDetail(getOrderDetail());
	}

	/*
	 * GETTERS & SETTERS *
	 */
	public PurchaseOrderDetailService getPurchaseOrderDetailService() {
		return purchaseOrderDetailService;
	}

	public void setPurchaseOrderDetailService(PurchaseOrderDetailService purchaseOrderDetailService) {
		this.purchaseOrderDetailService = purchaseOrderDetailService;
	}

	public List<PurchaseOrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<PurchaseOrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public PurchaseOrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(PurchaseOrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

	public PurchaseOrderDetail getNewOrderDetail() {
		return newOrderDetail;
	}

	public void setNewOrderDetail(PurchaseOrderDetail newOrderDetail) {
		this.newOrderDetail = newOrderDetail;
	}

	public List<PurchaseOrderDetail> getSelectedOrderDetails() {
		return selectedOrderDetails;
	}

	public void setSelectedOrderDetails(List<PurchaseOrderDetail> selectedOrderDetails) {
		this.selectedOrderDetails = selectedOrderDetails;
	}
}
