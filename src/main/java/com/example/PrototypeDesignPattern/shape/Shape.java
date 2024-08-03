package com.example.PrototypeDesignPattern.shape;

public interface Shape extends Cloneable {
    Shape clone();
    void draw();
    void setX(int x);
    void setY(int y);
}
