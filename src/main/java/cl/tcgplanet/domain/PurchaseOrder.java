package cl.tcgplanet.domain;

import java.time.LocalDate;

public class PurchaseOrder extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8904690599082084053L;
	private Integer id;
	private String code;
	private LocalDate createdDate;
	private LocalDate closeDate;
	private CodeName status;
	private Customer customer;
	private String city;
	private String comment;
	private Double price;
	private Double paid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public LocalDate getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(LocalDate closeDate) {
		this.closeDate = closeDate;
	}
	public CodeName getStatus() {
		if (null==status)
			setStatus(new CodeName());
		return status;
	}
	public void setStatus(CodeName status) {
		this.status = status;
	}
	public Customer getCustomer() {
//		if(null==customer)
//			setCustomer(new Customer());
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPaid() {
		return paid;
	}
	public void setPaid(Double paid) {
		this.paid = paid;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
}
