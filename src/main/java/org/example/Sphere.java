package org.example;

import org.example.Shape3DInterface;

import java.util.Random;

public class Sphere implements Shape3DInterface {
    private double radius;

    public Sphere() {
        Random rand = new Random();
        this.radius = 1 + (rand.nextDouble() * 9);
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public String getName() {
        return "Sphere";
    }
}
