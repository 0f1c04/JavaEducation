package com.kosta.day05;

public class Employee extends Object{
    private String id;
    private String name;
    private int baseSalary;

    //Constructor
    public Employee(String id, String name, int baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //getter & setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(double bonus) {
        return baseSalary + baseSalary * bonus;
    }

    /*
    toString() 메소드는 Object class의 이미 정의되어있다.
    toString() 메소드를 Employee class가 상속 받으면
    Employee class는 Object class의 toString() 메소드를 갖는다.
    만약 toString() 메소드를 작성한다면 재정의를 의미한다. (덮어쓰기)
    재정의 조건 : 시그니처가 같아야한다. (ex: public String tostring())
    접근제한자가의 제한번위가 넓어지는 것은 가능하지만 좁아지는 것은 불가하다. (public O, default X)
     */
    @Override
    public String toString() {
        return name + '(' + id + ") 사원의 기본급은 " + baseSalary + "원 입니다.";
    }
}
