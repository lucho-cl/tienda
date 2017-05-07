package cl.tcgplanet.domain;

import java.time.LocalDate;

public class Payment extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3018928587784995986L;

	private Integer id;
	private PurchaseOrder po;
	private Double amount;
	private String type;
	private LocalDate date;
	private String payer;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public PurchaseOrder getPo() {
		return po;
	}
	public void setPo(PurchaseOrder po) {
		this.po = po;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
}
