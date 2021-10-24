package com.kubino.learning;

import com.kubino.learning.Triangle.*;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Area: " + TriangleTools.getArea(triangle));
        System.out.println("Perimeter: " + TriangleTools.getPerimeter(triangle));
    }
}
