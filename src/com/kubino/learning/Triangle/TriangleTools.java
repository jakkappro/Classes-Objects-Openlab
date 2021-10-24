package com.kubino.learning.Triangle;

public class TriangleTools {
    public static double getArea(Triangle triangle) {
        var semiPerimeter = (triangle.getSideA() + triangle.getSideB() + triangle.getSideC()) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - triangle.getSideA()) *
                (semiPerimeter - triangle.getSideB()) * (semiPerimeter - triangle.getSideC()));
    }

    public static int getPerimeter(Triangle triangle) {
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }
}
