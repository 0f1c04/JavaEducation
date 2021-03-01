package com.kosta.day04;

/*
 modifier(접근제한자)
 1) public: 모든 패키지에서 접근가능
 2) protected
 3) 생략(default): 같은 패키지에서만 접근 가능
 4) private
 */
public class Employee {
    //1.Field(member variable): 객체마다 가지는 독립된 변수
    int empNo;
    String empName;
    String dept;
    String phone;

    //2. Constructor(생성자 메소드):
    public Employee() { //Default Constructor: 기본생성자
        this(0, null);
    }

    public Employee(int empNo, String empName) { //overloading
        this(empNo, empName, null, null);
    }

    public Employee(int empNo, String empName, String dept) {
        this(empNo, empName, dept, null);
    }

    public Employee(int empNo, String empName, String dept, String phone) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.phone = phone;
    }

    void print() {
        System.out.println("=========Employee Information=========");
        System.out.println("Employee Number:\t" + empNo);
        System.out.println("Employee Name:\t\t" + empName);
        System.out.println("Employee Department:\t" + dept);
        System.out.println("Employee Phone number:\t" + phone);
    }

    String getEmpInfo() {
        String s = "=====================================\n" +
                "Employee Number:\t" + empNo +
                "\nEmployee Name:\t\t" + empName +
                "\nEmployee Department:\t" + dept +
                "\nEmployee Phone number:\t" + phone;
        return s;
    }

    void changePhone(String phone) {
        this.phone = phone;
        System.out.println("The phone number has been changed.");
    }

    String changePhone2(String phone) {
        String originalNumber = this.phone;
        this.phone = phone;
        System.out.println("Returns the original phone number.");
        return originalNumber;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(1, "김덕용");
        Employee emp3 = new Employee(3, "박창식", "개발1팀");
        Employee emp4 = new Employee(4, "고창석", "개발2팀", "010-1234-5678");
        emp1.print();
        emp2.print();
        emp3.print();
        emp4.print();

        String s = emp4.getEmpInfo();
        System.out.println(s);

        //change phone number
        emp1.changePhone("010-1111-2222");
        emp1.print();

        emp2.changePhone2("010-2222-3333");
        String s2 = emp2.changePhone2(s);
        System.out.println(s2);

    }
}
