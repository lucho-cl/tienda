package cl.tcgplanet.service;

import java.util.List;

import cl.tcgplanet.domain.Product;

public interface ProductService {
    public Product getProduct(Product product);
    
    public List<Product> getAllProducts();

    public void insertProduct(Product product);

    public void updateProduct(Product product);
    
    public void deleteProduct(Product product);
}
