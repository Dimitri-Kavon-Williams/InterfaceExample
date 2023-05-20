package com.example.inheritanceexample;

public interface Shape {
    // Code Sharing isn't useful in this case,
    // because each class implements its behaviour
    // differently

    // Area                            Perimeter
    // Circle: Pi*R*R                  2 * pi * R
    // Rectangle: L*W                  ( w + l) *2
    // Triangle: h*b/2                  a + b + c
    //

     public double CalculateArea();


     public double CalculatePerimeter();

    // Interface: can only contain method headers and
    // class constants.


}
