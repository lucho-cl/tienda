package cl.tcgplanet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.tcgplanet.domain.Product;
import cl.tcgplanet.persistence.ProductMapper;

public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMapper productMapper;
	
	public Product getProduct(Product product) {
		return productMapper.getProduct(product);
	}

	public List<Product> getAllProducts() {
		return productMapper.getAllProducts();
	}

	public void insertProduct(Product product) {
		productMapper.insertProduct(product);
	}

	public void updateProduct(Product product) {
		productMapper.updateProduct(product);
	}

	public void deleteProduct(Product product) {
		productMapper.deleteProduct(product);
	}

}
