package com.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

// Indicates Feedback as the entity and creating a table named as it
@Entity @Table(name = "feedback")
public class Feedback {

    // Auto-Generates id 
    @Id
    @GeneratedValue
    private int id;

    private String customerName;
    private String customerEmail;
    private String country;
    private int productQuality;
    private int serviceQuality;
    private int orderAccuracy;
    private int valueForMoney;
    private int timeliness;
    private String customerSuggestions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getProductQuality() {
        return productQuality;
    }

    public void setProductQuality(int productQuality) {
        this.productQuality = productQuality;
    }

    public int getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(int serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    public int getOrderAccuracy() {
        return orderAccuracy;
    }

    public void setOrderAccuracy(int orderAccuracy) {
        this.orderAccuracy = orderAccuracy;
    }

    public int getValueForMoney() {
        return valueForMoney;
    }

    public void setValueForMoney(int valueForMoney) {
        this.valueForMoney = valueForMoney;
    }

    public int getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(int timeliness) {
        this.timeliness = timeliness;
    }

    public String getCustomerSuggestions() {
        return customerSuggestions;
    }

    public void setCustomerSuggestions(String customerSuggestions) {
        this.customerSuggestions = customerSuggestions;
    }


}