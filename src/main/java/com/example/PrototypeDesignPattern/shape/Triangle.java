package com.example.PrototypeDesignPattern.shape;

public class Triangle implements Shape {
    private int x;
    private int y;
    private final int base;
    private final int height;

    public Triangle(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Triangle(x, y, base, height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle at (" + x + ", " + y + ") with base " + base + " and height " + height);
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
