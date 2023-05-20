package com.example.inheritanceexample;

public class Rectangle implements Shape{
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double CalculateArea(){
        return width * height;
    }


    public double CalculatePerimeter(){
        return 2 * (height + width);
    }

}
