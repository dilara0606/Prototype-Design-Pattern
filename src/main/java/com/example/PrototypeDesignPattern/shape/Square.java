package com.example.PrototypeDesignPattern.shape;

public class Square implements Shape {
    private int x;
    private int y;
    private final int side;

    public Square(int x, int y, int side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public Shape clone() {
        return new Square(x, y, side);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square at (" + x + ", " + y + ") with side " + side);
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}
