package cl.tcgplanet.domain;

import java.util.Date;

public class PurchaseOrder {

	private Integer id;
	private String code;
	private Date closeDate;
	private Object status;
	private Object client;
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
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public Object getStatus() {
		return status;
	}
	public void setStatus(Object status) {
		this.status = status;
	}
	public Object getClient() {
		return client;
	}
	public void setClient(Object client) {
		this.client = client;
	}
}
