package cl.tcgplanet.domain;

import java.util.Date;

public class Product {
	private String sku;
	private String name;
	private String description;
	private Double mrp;
	private Double price;
	private Double tradePrice;
	private Object status;
	private Date releaseDate;
	private String range;
	private String ssCode;
	private Object provider;
	private String tag;
	private String system;
	private String race;
	private String type;
	private String barcode;
	private String commodityCode;
	private Object countryOrigin;
	private Double weight;
	private Double cube;
	private Double orderWeight;
	private Double orderCube;
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getMrp() {
		return mrp;
	}
	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getTradePrice() {
		return tradePrice;
	}
	public void setTradePrice(Double tradePrice) {
		this.tradePrice = tradePrice;
	}
	public Object getStatus() {
		return status;
	}
	public void setStatus(Object status) {
		this.status = status;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getSsCode() {
		return ssCode;
	}
	public void setSsCode(String ssCode) {
		this.ssCode = ssCode;
	}
	public Object getProvider() {
		return provider;
	}
	public void setProvider(Object provider) {
		this.provider = provider;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getCommodityCode() {
		return commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}
	public Object getCountryOrigin() {
		return countryOrigin;
	}
	public void setCountryOrigin(Object countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getCube() {
		return cube;
	}
	public void setCube(Double cube) {
		this.cube = cube;
	}
	public Double getOrderWeight() {
		return orderWeight;
	}
	public void setOrderWeight(Double orderWeight) {
		this.orderWeight = orderWeight;
	}
	public Double getOrderCube() {
		return orderCube;
	}
	public void setOrderCube(Double orderCube) {
		this.orderCube = orderCube;
	}
}
