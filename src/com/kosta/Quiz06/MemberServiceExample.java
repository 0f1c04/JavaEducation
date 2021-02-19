package com.kosta.Quiz06;
//15.
public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.lgoin("hong", "12345");
        if(result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        }else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
