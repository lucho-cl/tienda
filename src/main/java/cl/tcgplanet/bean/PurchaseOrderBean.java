package cl.tcgplanet.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;

import org.primefaces.event.SelectEvent;

import cl.tcgplanet.domain.Product;
import cl.tcgplanet.domain.PurchaseOrder;
import cl.tcgplanet.domain.PurchaseOrderDetail;
import cl.tcgplanet.service.ProductService;
import cl.tcgplanet.service.PurchaseOrderDetailService;
import cl.tcgplanet.service.PurchaseOrderService;

@ManagedBean
@ViewScoped
public class PurchaseOrderBean {

	@ManagedProperty("#{purchaseOrderService}")
	private PurchaseOrderService purchaseOrderService;
	@ManagedProperty("#{purchaseOrderDetailService}")
	private PurchaseOrderDetailService purchaseOrderDetailService;
	@ManagedProperty("#{productService}")
	private ProductService productService;

	private List<PurchaseOrder> orders;

	private PurchaseOrder order;
	private PurchaseOrder newOrder;

	private List<PurchaseOrderDetail> orderDetails;

	private List<Product> products;
	private List<Product> selectedProducts;

	private Double orderTotal;

	@PostConstruct
	public void init() {
		System.out.println("Inicializando PurchaseOrderBean...");
		// inicializo valores
		newOrder = new PurchaseOrder();
		getPurchases();
	}

	public void getPurchases() {
		orders = purchaseOrderService.getAllPurchaseOrders();
	}

//	public void addOrder() {
//		purchaseOrderService.insertPurchaseOrder(getNewOrder());
//	}

//	public void modifyOrder() {
//		purchaseOrderService.updatePurchaseOrder(getOrder());
//	}

	public void onItemSelect(SelectEvent event) {
		// FacesContext.getCurrentInstance().addMessage(null, new
		// FacesMessage("Item Selected", event.getObject().toString()));
	}

	public void getAllProducts() {
		System.out.println("Obteniendo productos");
		products = productService.getAllProducts();
	}

	public void addProducts() {
		if (null == orderDetails) {
			orderDetails = new ArrayList<PurchaseOrderDetail>();
		}
		for (Product product : selectedProducts) {
			boolean existe = false;
			for (PurchaseOrderDetail purchaseOrderDetail : orderDetails) {
				if (purchaseOrderDetail.getProduct().getSku().equals(product.getSku())) {
					existe = true;
					break;
				}
			}
			if (!existe) {
				PurchaseOrderDetail newDetail = new PurchaseOrderDetail();
				newDetail.setProduct(product);
				newDetail.setPrice(product.getPrice());
				newDetail.setQuantity(1);
				orderDetails.add(newDetail);
			}
		}
		// TODO: ver como deseleccionar los productos
		selectedProducts = new ArrayList<Product>();
		selectedProducts = null;
		calculateTotal();
	}

	public void removeProduct(PurchaseOrderDetail detail) {
		orderDetails.remove(detail);
		calculateTotal();
	}

	public void createOrder(ActionEvent actionEvent) {
		// 1° Validate data
		if (validateNewOrder()) {
			// save the data
			purchaseOrderService.insertPurchaseOrder(newOrder);
			for (PurchaseOrderDetail purchaseOrderDetail : orderDetails) {
				purchaseOrderDetail.setPo(newOrder);
				purchaseOrderDetailService.insertPurchaseOrderDetail(purchaseOrderDetail);
			}
			System.out.print("Order " + newOrder.getCode() + "successfully created");
			addMessage("Order " + newOrder.getCode() + " successfully created");
		} else {
			// FacesMessage message = new
			// FacesMessage(FacesMessage.SEVERITY_ERROR, "Order can't be saved,
			// review data",
			// null);
			// FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}


	public void calculatePartialTotal(AjaxBehaviorEvent event) {
		PurchaseOrderDetail detail = (PurchaseOrderDetail) event.getComponent().getAttributes().get("det");
		detail.setPrice(detail.getQuantity() * detail.getProduct().getPrice());
		calculateTotal();
	}

	private void calculateTotal() {
		orderTotal = (double) 0;
		for (PurchaseOrderDetail purchaseOrderDetail : orderDetails) {
			orderTotal = orderTotal + purchaseOrderDetail.getPrice();
		}
		System.out.println("Total: " + orderTotal);
	}

	// TODO: validate order and products info
	private boolean validateNewOrder() {
		if (orderDetails==null || orderDetails.isEmpty()) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Order can't be saved, add some products!",
					null);
			FacesContext.getCurrentInstance().addMessage(null, message);
			return false;
		}
		return true;
	}

	public void buttonAction(ActionEvent actionEvent) {
		addMessage("Welcome to Primefaces!!");
	}

	private void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public String marcarAbonado(PurchaseOrder order){
		order.getStatus().setLabel("2");
		purchaseOrderService.updatePurchaseOrder(order);
		getPurchases();
		return null;
	}
	
	/*
	 * GETTERS & SETTERS *
	 */
	public PurchaseOrderService getPurchaseOrderService() {
		return purchaseOrderService;
	}

	public void setPurchaseOrderService(PurchaseOrderService purchaseOrderService) {
		this.purchaseOrderService = purchaseOrderService;
	}

	public List<PurchaseOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<PurchaseOrder> orders) {
		this.orders = orders;
	}

	public PurchaseOrder getOrder() {
		return order;
	}

	public void setOrder(PurchaseOrder order) {
		this.order = order;
	}

	public PurchaseOrder getNewOrder() {
		return newOrder;
	}

	public void setNewOrder(PurchaseOrder newOrder) {
		this.newOrder = newOrder;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getSelectedProducts() {
		return selectedProducts;
	}

	public void setSelectedProducts(List<Product> selectedProducts) {
		this.selectedProducts = selectedProducts;
	}

	public List<PurchaseOrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<PurchaseOrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public PurchaseOrderDetailService getPurchaseOrderDetailService() {
		return purchaseOrderDetailService;
	}

	public void setPurchaseOrderDetailService(PurchaseOrderDetailService purchaseOrderDetailService) {
		this.purchaseOrderDetailService = purchaseOrderDetailService;
	}
}
