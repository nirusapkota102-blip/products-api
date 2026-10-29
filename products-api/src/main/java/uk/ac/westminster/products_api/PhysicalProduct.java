
package uk.ac.westminster.products_api;

// Child class that inherits from Product
public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    // No-argument constructor
    public PhysicalProduct() {
    }

    // Full constructor
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // Getters
    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    // Setters
    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}





