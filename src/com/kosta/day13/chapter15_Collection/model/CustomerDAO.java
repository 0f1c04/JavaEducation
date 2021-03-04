package com.kosta.day13.chapter15_Collection.model;

import java.util.ArrayList;
import java.util.List;

//DAO(Data Access Object): 업무로직 중 DB에 접근하는 업무 작성
//사용자 요청 -> Controller -> Service(업무로직) -> DAO(Data Access Object) -> DB
//     응답 <-            <-                 <-                         <-
public class CustomerDAO {
    List<CustomerDTO> customerList = new ArrayList<>();

    public CustomerDAO() {
        customerList.add(new CustomerDTO(1, "임덕배", "010-1234-5678", "금천구"));
        customerList.add(new CustomerDTO(2, "도덕배", "010-6634-8678", "관악구"));
        customerList.add(new CustomerDTO(3, "최덕배", "010-2334-1278", "용산구"));
        customerList.add(new CustomerDTO(4, "양덕배", "010-5134-9678", "강남구"));
        customerList.add(new CustomerDTO(5, "김덕배", "010-2134-1648", "강북구"));
    }

    public List<CustomerDTO> selectAll() {
        //모든 고객을 조회
        return customerList;
    }
    public CustomerDTO selectByID(int customerID) {
        //해당 고객을 ID로 조회
        for(CustomerDTO customers:customerList) {
            if(customers.getCustomerID() == customerID) return customers;
        }
        return null;
    }
    public CustomerDTO selectByPhoneNumber(String customerPhoneNumber) {
        //해당 고객을 전화번호로 조회
        for(CustomerDTO customers:customerList) {
            if(customers.getCustomerPhoneNumber().equals(customerPhoneNumber)) return customers;
        }
        return null;
    }
    public int insert(CustomerDTO customerDTO) {
        //해당 고객을 정보 입력
        customerList.add(customerDTO);
        return 1;
    }
    public int update(CustomerDTO customerDTO) {
        //해당 고객의 정보 갱신
        for(int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getCustomerID() == customerDTO.getCustomerID()) {
                customerList.get(i).setCustomerID(customerDTO.getCustomerID());
                customerList.get(i).setCustomerName(customerDTO.getCustomerName());
                customerList.get(i).setCustomerPhoneNumber(customerDTO.getCustomerPhoneNumber());
                customerList.get(i).setCustomerAddress(customerDTO.getCustomerAddress());
            }
        }
        return 1;
    }
    public int delete(int customerID) {
        //해당 고객의 정보 삭제
        for(int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getCustomerID() == customerID) {
                customerList.remove(i);
                break;
            }
        }
        return 1;
    }
}
