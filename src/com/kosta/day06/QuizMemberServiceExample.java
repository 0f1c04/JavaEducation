package com.kosta.day06;

//Application, App(어플리케이션, main이 있어야됨)
public class QuizMemberServiceExample {
    public static void main(String[] args) {
        QuizMemberService quizMemberService = new QuizMemberService();
        QuizMember quizMember = new QuizMember(null, "hong", "12345", 0);

        QuizMember result = quizMemberService.login(quizMember);
        if (quizMember != null) {
            System.out.println("로그인 되었습니다.");
            quizMemberService.logout(quizMember.getName());
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
