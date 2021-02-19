package com.kosta.Quiz06;

public class MemberService {
    boolean lgoin(String id, String password) {
        boolean result;

        if (id.equals("hong")) result = true;
        else result = false;

        if (password.equals("12345")) result = true;
        else result = false;

        return result;
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
