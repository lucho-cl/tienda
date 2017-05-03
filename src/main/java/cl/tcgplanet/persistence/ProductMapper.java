package cl.tcgplanet.persistence;

import java.util.List;

import cl.tcgplanet.domain.Product;

public interface ProductMapper {
	
	public Product getProduct(Product product);

    public List<Product> getAllProducts();

    public void insertProduct(Product product);

    public void updateProduct(Product product);
    
    public void deleteProduct(Product product);
}
