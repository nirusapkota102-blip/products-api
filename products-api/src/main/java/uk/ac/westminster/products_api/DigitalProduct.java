
package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {

    private double fileSizeMB;
    private String downloadUrl;
    private double discountedPrice;

    public DigitalProduct() {
    }

    public DigitalProduct(Long id, String name, double price,
                          double fileSizeMB, String downloadUrl) {
        super(id, name, price);
        this.fileSizeMB = fileSizeMB;
        this.downloadUrl = downloadUrl;
        this.discountedPrice = price;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public void applyDiscount(double rate) {
        if (rate < 0 || rate > 1) {
            throw new IllegalArgumentException(
                    "Discount rate must be between 0 and 1"
            );
        }

        discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName()
                + " | Download: " + downloadUrl;
    }
}









