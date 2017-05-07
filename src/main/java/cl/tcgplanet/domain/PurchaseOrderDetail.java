package cl.tcgplanet.domain;

public class PurchaseOrderDetail extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1750672789618418337L;
	private PurchaseOrder po;
	private Product product;
	private Integer quantity;
	private Double price;
	public PurchaseOrder getPo() {
		return po;
	}
	public void setPo(PurchaseOrder po) {
		this.po = po;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
