package com.kosta.day08.lab4;

public class DaoExample {
    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());

        //익명 구현 객체: 1회용
        dbWork(new DataAccessObject() {
            @Override
            public void select() {
                System.out.println("익명 구현 객체 select");
            }

            @Override
            public void insert() {
                System.out.println("익명 구현 객체 insert");
            }

            @Override
            public void update() {
                System.out.println("익명 구현 객체 update");
            }

            @Override
            public void delete() {
                System.out.println("익명 구현 객체 delete");
            }
        });
    }

    private static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
}
