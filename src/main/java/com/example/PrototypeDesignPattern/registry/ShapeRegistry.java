package com.example.PrototypeDesignPattern.registry;

import com.example.PrototypeDesignPattern.shape.Shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private Map<String, Shape> shapes = new HashMap<>();

    public void addShape(String type, Shape shape) {
        shapes.put(type, shape);
    }

    public Shape getShape(String type) {
        Shape shape = shapes.get(type);
        return shape != null ? shape.clone() : null;
    }
}
