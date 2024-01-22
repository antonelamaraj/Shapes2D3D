package com.amaraj.springbasics.forma2D3D;

import org.springframework.stereotype.Component;

@Component
public class Trapez implements  Shape2D{

    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return "trapez".equals(shapeType);
    }

    @Override
    public Double calculatePerimeter(Double... parameters) {
        //perimetri = A + B +C + D
        Double brinjaA = parameters[0];
        Double brinjaB = parameters[1];
        Double brinjaC = parameters[2];
        Double brinjaD = parameters[3];
        return (brinjaA + brinjaB + brinjaC + brinjaD);
    }

    @Override
    public Double calculateArea(Double... parameters) {
        // siperfaqja = ((A+B) * lartesi) ÷ 2
        Double brinjaA = parameters[0];
        Double brinjaB = parameters[1];
        Double lartesia = parameters[2];
        return ((brinjaA + brinjaB) *lartesia) / 2;
    }
}
