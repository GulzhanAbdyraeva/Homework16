package com.company;

public class Cirlce {

    private static final double PI = 3.14;
    private static double radius;

    public Cirlce() {
    }

    public Cirlce(double radius) {
        this.radius = radius;
    }

    public static double area() {
       double area =  PI * (radius*radius);
        System.out.print("Area: " + PI + " * " + " ( " + radius+ " * "+ radius+ " ) " );
        return area;
    }

    public static double circumference(){
        double circumference = PI *2*radius;
        System.out.print("Circumference: "+ PI + " * " + 2 + " * " +  radius+ " = ");
        return circumference;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}

