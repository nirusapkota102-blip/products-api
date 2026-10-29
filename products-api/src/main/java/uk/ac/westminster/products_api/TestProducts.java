
package uk.ac.westminster.products_api;

public class TestProducts {

    public static void main(String[] args) {

        PhysicalProduct physical = new PhysicalProduct(
                1L, "Laptop", 999.99, 2.5, "35 x 25 x 2 cm"
        );

        DigitalProduct digital = new DigitalProduct(
                2L, "Java E-book", 19.99, 50.0,
                "https://example.com/java-ebook"
        );

        System.out.println("Physical Product");
        System.out.println("Name: " + physical.getName());
        System.out.println("Price: " + physical.getPrice());
        System.out.println("Weight: " + physical.getWeightKg());
        System.out.println("Dimensions: " + physical.getDimensions());

        System.out.println();

        System.out.println("Digital Product");
        System.out.println("Name: " + digital.getName());
        System.out.println("Price: " + digital.getPrice());
        System.out.println("File size: " + digital.getFileSizeMB());
        System.out.println("Download URL: " + digital.getDownloadUrl());
    }
}










