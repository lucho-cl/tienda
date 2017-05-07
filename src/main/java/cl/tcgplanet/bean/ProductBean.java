package cl.tcgplanet.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import cl.tcgplanet.domain.Product;
import cl.tcgplanet.service.ProductService;

@ManagedBean
@ViewScoped
public class ProductBean {

	@ManagedProperty("#{productService}")
	private ProductService productService;

	private List<Product> products;
	private List<Product> selectedProducts;

	private Product product;
	private Product newProduct;

	@PostConstruct
	public void init() {
		System.out.println("Inicializando ProductBean...");
//		products = productService.getAllProducts();
	}

	public void getAllProducts() {
		System.out.println("Obteniendo productos");
		products = productService.getAllProducts();
	}

	public void addProduct() {
		productService.insertProduct(newProduct);
	}

	public void modifyProduct() {
		productService.updateProduct(product);
	}


	/*
	 * GETTERS & SETTERS *
	 */
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
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
}