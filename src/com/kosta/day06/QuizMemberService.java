package com.kosta.day06;

//Service: business logic(업무로직)
public class QuizMemberService {
    QuizMember login (QuizMember quizMember) {
        if (quizMember.getId().equals("hong") && quizMember.getPassword().equals("12345")) {
            quizMember.setName("홍길동");
            quizMember.setAge(20);
            return quizMember;
        } else {
            return null;
        }
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
