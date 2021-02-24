package com.kosta.day08;

public class MyClass {
    //field
    RemoteControl rc = new Television();

    //constructor
    public MyClass(RemoteControl rc) {
        this.rc = rc;
    }

    //method
    void methodA() {
        //local variable
        rc = new Audio();
    }

    void setRc(RemoteControl rc) { this.rc = rc; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyClass{");
        sb.append("rc=").append(rc);
        sb.append('}');
        return sb.toString();
    }
}
