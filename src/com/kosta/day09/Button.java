package com.kosta.day09;

class MessageListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("MessageListener 클릭");
    }
}

class CallListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("CallListener 클릭");
    }
}

public class Button {
    OnClickListener listener; //인터페이스 타입 필드

    public void setListener(OnClickListener listener) { //매개 변수의 다형성
        this.listener = listener;
    }

    //method
    void touch() {
        listener.onClick(); //구현 객체의 onClick() 메소드 호출
    }

    //inner interface
    interface OnClickListener { //중첩 인터페이스
        void onClick();
    }
}
