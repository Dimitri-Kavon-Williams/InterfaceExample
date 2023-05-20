package com.example.inheritanceexample;

public class CodeTest {
    public static void main(String[] args){

        // inheritance : is used to implement the "is-a" relationship
        // composition : is used to implement the "has-a" relationship

     Shape shape1 = new Circle(10,10,7);
     Shape shape2 = new Rectangle(5,5);
     Shape shape3 = new Triangle(7,4,4,5,6);

     System.out.println(("The Area of Circle: " + shape1.CalculateArea()));
     System.out.println(("The Area of Rect: " + shape2.CalculateArea()));
     System.out.println(("The Area of Triangle: " + shape3.CalculateArea()));


    }

}
