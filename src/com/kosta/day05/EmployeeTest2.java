package com.kosta.day05;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee emp = new Employee("99jy12", "배대장", 6000000);
        double sal = emp.getSalary(0.2);
        System.out.println("이번달 급여 :" + sal);
        System.out.println(emp);
        emp.setBaseSalary(10000000);
        System.out.println(emp);
    }
}
