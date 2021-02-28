package com.kosta.day08.innerclass;

public class Outer {
    private Inner y;

    public void setY(Inner y) {
        this.y = y;
    }

    public Inner getY() {
        return y;
    }

    class Inner {
        private int x;

        public void setX(int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }
    }
}
