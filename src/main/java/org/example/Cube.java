package org.example;

import java.util.Random;

public class Cube implements Shape3DInterface {
    private double sideLength;

    public Cube() {
        Random rand = new Random();
        this.sideLength = 1 + (rand.nextDouble() * 9);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public double volume() {
        return Math.pow(sideLength, 3);
    }

    public String getName() {
        return "Cube";
    }
}
