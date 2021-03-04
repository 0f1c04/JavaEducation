package com.kosta.day13.chapter15_Collection.view;

import com.kosta.day13.chapter15_Collection.model.CustomerDTO;

import java.util.List;

//고객정보 표시
//웹으로 전환시 불필요

public class CustomerView {
    public static void display(List<CustomerDTO> customerList) {
        System.out.println("=======고객정보 List=======");
        for(CustomerDTO customers:customerList) {
//            System.out.println(customers.getCustomerName());
//            System.out.println(customers.getCustomerID());
//            System.out.println(customers.getCustomerPhoneNumber());
//            System.out.println(customers.getCustomerAddress());
            System.out.println(customers);
        }
    }
    public static void display(CustomerDTO customer) {
        System.out.println("=======고객정보=======");
        System.out.println(customer);
    }
    public static void display(String message) {
        System.out.println(message);
    }
}
