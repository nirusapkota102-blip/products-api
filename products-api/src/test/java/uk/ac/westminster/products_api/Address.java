package uk.ac.westminster.products_api;

public class Address {

    private String street;
    private String city;
    private String postcode;

    // No-argument constructor
    public Address() {
    }

    // Full constructor
    public Address(String street, String city, String postcode) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    // Getters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }
}

