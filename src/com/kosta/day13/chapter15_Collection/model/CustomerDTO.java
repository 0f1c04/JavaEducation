package com.kosta.day13.chapter15_Collection.model;

import java.util.Objects;

//DTO(Data Transfer Object)
public class CustomerDTO implements Comparable<CustomerDTO>{
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

    //중복체 추가 (2021-03-05)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDTO that = (CustomerDTO) o;
        return customerID == that.customerID &&
                Objects.equals(customerName, that.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID, customerName);
    }

    //Comparable 추가
    @Override
    public int compareTo(CustomerDTO obj) {
        int aa = customerAddress.compareTo(obj.customerAddress);
        if(aa == 0)
            return customerID - obj.customerID; //음수면 왼쪽이 크다, 양수면 오른쪽이 크다
        else
            return aa;
    }
}
