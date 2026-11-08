
package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    // Constructor: add sample products of both types
    public ProductService() {

        // Add a digital product
        DigitalProduct ebook = new DigitalProduct(
                nextId++,
                "Java E-book",
                19.99,
                50.0,
                "https://example.com/java-ebook"
        );

        ebook.applyDiscount(0.10);
        products.add(ebook);

        // Add a physical product
        PhysicalProduct laptop = new PhysicalProduct(
                nextId++,
                "Laptop",
                999.99,
                2.5,
                "35 x 25 x 2 cm"
        );

        laptop.applyDiscount(0.10);
        products.add(laptop);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Add a product
    public Product addProduct(Product product) {

        product.setId(nextId++);

        if (product instanceof Discountable d) {
            d.applyDiscount(0.10);
        }

        products.add(product);
        return product;
    }

    // Get a product by ID
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    // Delete a product by ID
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    // Search products by name
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

    // Get summaries of all products
    public List<String> getAllSummaries() {

        List<String> summaries = new ArrayList<>();

        for (Product p : products) {
            summaries.add(p.getSummary());
        }

        return summaries;
    }
}










