package cl.tcgplanet.bean;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.event.SelectEvent;

import cl.tcgplanet.domain.Payment;
import cl.tcgplanet.domain.PurchaseOrder;
import cl.tcgplanet.service.PaymentService;
import cl.tcgplanet.service.PurchaseOrderService;

@ManagedBean
@ViewScoped
public class PaymentBean {

	@ManagedProperty("#{paymentService}")
	private PaymentService paymentService;
	@ManagedProperty("#{purchaseOrderService}")
	private PurchaseOrderService purchaseOrderService;

	private List<Payment> payments;

	private Payment payment;
	private Payment newPayment;

	private PurchaseOrder purchaseOrder;
	private String orderCode;

	@PostConstruct
	public void init() {
		System.out.println("Iniciando PaymentBean...");
		newPayment = new Payment();
		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		orderCode = params.get("orderCode");
		if (null != orderCode) {
			purchaseOrder = new PurchaseOrder();
			purchaseOrder.setCode(orderCode);
			purchaseOrder = getPurchaseOrderService().getPurchaseOrder(purchaseOrder);
			if (null != purchaseOrder) {
				clean();
			}
		}
		// System.out.println((PurchaseOrder)params.get("purchaseOrder"));
	}
//
//	public String goToPayments(PurchaseOrder order) {
//		String result = "/page/payment.xhtml?faces-redirect=true";
//		System.out.println("Order: " + order.getCode());
//		purchaseOrder = order;
//		return result;
//	}

//	public void getAllPayments() {
//		payments = paymentService.getAllPayments();
//	}

	public void addPayment(ActionEvent event) {
		clean();
	}

	public void createPayment() {
		newPayment.setPo(purchaseOrder);
		paymentService.insertPayment(newPayment);
		clean();
	}

	public void modifyPayment() {
		payment.setPo(purchaseOrder);
		paymentService.updatePayment(payment);
		clean();
	}

	// Metodo que limpia variables y actualiza lista de pagos
	private void clean() {
		newPayment = new Payment();
		payment = new Payment();
		newPayment.setPo(purchaseOrder);
		payment.setPo(purchaseOrder);
		payments = paymentService.getPayments(payment);
	}

    public void onRowSelect(SelectEvent event) {
    	payment = (Payment) event.getObject();
    	System.out.println("fecha: "+payment.getDate());
    }
	/*
	 * GETTERS & SETTERS *
	 */
	public PaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Payment getNewPayment() {
		return newPayment;
	}

	public void setNewPayment(Payment newPayment) {
		this.newPayment = newPayment;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public PurchaseOrderService getPurchaseOrderService() {
		return purchaseOrderService;
	}

	public void setPurchaseOrderService(PurchaseOrderService purchaseOrderService) {
		this.purchaseOrderService = purchaseOrderService;
	}
}
