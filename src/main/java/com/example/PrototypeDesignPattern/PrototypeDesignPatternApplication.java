package com.example.PrototypeDesignPattern;

import com.example.PrototypeDesignPattern.registry.ShapeRegistry;
import com.example.PrototypeDesignPattern.shape.Circle;
import com.example.PrototypeDesignPattern.shape.Shape;
import com.example.PrototypeDesignPattern.shape.Square;
import com.example.PrototypeDesignPattern.shape.Triangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrototypeDesignPatternApplication.class, args);

		ShapeRegistry registry = new ShapeRegistry();

		// Orijinal şekilleri ekleme
		registry.addShape("Circle", new Circle(10, 20, 15));
		registry.addShape("Square", new Square(30, 40, 20));
		registry.addShape("Triangle", new Triangle(50, 60, 25, 30));

		// Klonlanan şekilleri alma
		Shape clonedCircle = registry.getShape("Circle");
		Shape clonedSquare = registry.getShape("Square");
		Shape clonedTriangle = registry.getShape("Triangle");

		// Klonlanan şekilleri yeniden konumlandırma
		clonedCircle.setX(100);
		clonedCircle.setY(200);
		clonedSquare.setX(300);
		clonedSquare.setY(400);
		clonedTriangle.setX(500);
		clonedTriangle.setY(600);

		// Klonlanan şekilleri çizme
		clonedCircle.draw();
		clonedSquare.draw();
		clonedTriangle.draw();
	}

}
