
package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {

    private double fileSizeMB;
    private String downloadUrl;

    public DigitalProduct() {
    }

    public DigitalProduct(Long id, String name, double price,
                          double fileSizeMB, String downloadUrl) {
        super(id, name, price);
        this.fileSizeMB = fileSizeMB;
        this.downloadUrl = downloadUrl;
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
}





