package com.kosta.day13.chapter15_Collection.model;

//DTO(Data Transfer Object)
public class CustomerDTO {
    private int customerID;
    private String customerName;
    private String customerPhoneNumber;
    private String customerAddress;

    public CustomerDTO() { }

    public CustomerDTO(int customerID, String customerName, String customerPhoneNumber, String customerAddress) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerAddress = customerAddress;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerDTO{");
        sb.append("customerID=").append(customerID);
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", customerPhoneNumber='").append(customerPhoneNumber).append('\'');
        sb.append(", customerAddress='").append(customerAddress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
