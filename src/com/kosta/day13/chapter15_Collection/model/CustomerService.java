package com.kosta.day13.chapter15_Collection.model;

import java.util.List;

//Service
//사용자 요청 -> Controller -> Service(업무로직) -> DAO(Data Access Object) -> DB
//     응답 <-            <-                 <-                         <-
public class CustomerService {
    CustomerDAO dao = new CustomerDAO();

    public List<CustomerDTO> selectAll() {
        //모든 고객을 조회
        return dao.selectAll();
    }
    public CustomerDTO selectByID(int customerID) {
        //해당 고객을 ID로 조회
        return dao.selectByID(customerID);
    }
    public CustomerDTO selectByPhoneNumber(String customerPhoneNumber) {
        //해당 고객을 전화번호로 조회
        return dao.selectByPhoneNumber(customerPhoneNumber);
    }
    public int insert(CustomerDTO customerDTO) {
        //해당 고객을 정보 입력
        return dao.insert(customerDTO);
    }
    public int update(CustomerDTO customerDTO) {
        //해당 고객의 정보 갱신
        return dao.update(customerDTO);
    }
    public int delete(int customerID) {
        //해당 고객의 정보 삭제
        return dao.delete(customerID);
    }
}
