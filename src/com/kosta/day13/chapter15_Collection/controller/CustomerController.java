package com.kosta.day13.chapter15_Collection.controller;

import com.kosta.day13.chapter15_Collection.model.CustomerDTO;
import com.kosta.day13.chapter15_Collection.model.CustomerService;
import com.kosta.day13.chapter15_Collection.view.CustomerView;

import java.util.List;
import java.util.Scanner;

//Server Program으로 작성될 예정(servlet, controller)
public class CustomerController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<CustomerDTO> customerList = null;
        CustomerDTO customer = null;
        int result = 0;
        CustomerService service = new CustomerService();

        while (true) {
            System.out.println("1.모두조회\t2.ID로 조회\t3.전화번호로 조회\n4.정보 입력\t5.정보 수정\t6.정보 삭제\t\t0.종료");
            System.out.print("선택>");
            int select = sc.nextInt();
            if (select == 0) break;
            switch (select) {
                case 1:
                    customerList = service.selectAll();
                    CustomerView.display(customerList);
                    break;
                case 2:
                    System.out.print("조회할 ID입력>");
                    int customerID = sc.nextInt();
                    customer = service.selectByID(customerID);
                    CustomerView.display(customer);
                    break;
                case 3:
                    System.out.print("조회할 전화번호 입력>");
                    String customerPhoneNumber = sc.next();
                    customer = service.selectByPhoneNumber(customerPhoneNumber);
                    CustomerView.display(customer);
                    break;
                case 4:
                    System.out.println("신규 입력(ID Name Phone city)>");
                    customer = new CustomerDTO(sc.nextInt(), sc.next(), sc.next(), sc.next());
                    result = service.insert(customer);
                    CustomerView.display(result == 1 ? "입력 성공" : "입력 실패");
                    break;
                case 5:
                    System.out.println("수정 정보(ID Name Phone city)>");
                    customer = new CustomerDTO(sc.nextInt(), sc.next(), sc.next(), sc.next());
                    result = service.update(customer);
                    CustomerView.display(result == 1 ? "수정 성공" : "수정 실패");
                    break;
                case 6:
                    System.out.println("삭제할 ID 입력>");
                    result = service.delete(sc.nextInt());
                    CustomerView.display(result == 1 ? "삭제 성공" : "삭제 실패");
                    break;
                default:
                    break;
            }
        }

        System.out.println("프로그램 종료");
        sc.close();
    }
}
