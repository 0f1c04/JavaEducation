package com.kosta.day08.lab4;

public class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println(getClass().getSimpleName() + " select");
    }

    @Override
    public void insert() {
        System.out.println(getClass().getSimpleName() + " insert");
    }

    @Override
    public void update() {
        System.out.println(getClass().getSimpleName() + " update");
    }

    @Override
    public void delete() {
        System.out.println(getClass().getSimpleName() + " delete");
    }
}
