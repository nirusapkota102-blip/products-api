

package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    // Get all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Add a product
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    // Get one product by ID
    public Product getById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    // Delete a product by ID
    public boolean deleteProduct(Long id) {
        return products.removeIf(product -> product.getId().equals(id));
    }

    // Search products by name
    public List<Product> searchProducts(String name) {
        List<Product> results = new ArrayList<>();

        for (Product product : products) {
            if (product.getName()
                    .toLowerCase()
                    .contains(name.toLowerCase())) {
                results.add(product);
            }
        }

        return results;
    }
}



