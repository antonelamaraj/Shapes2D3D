package com.amaraj.springbasics.forma2D3D;

import org.springframework.stereotype.Component;

@Component
public class Drejtkendesh implements Shape2D{

    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return "drejtkendesh".equals(shapeType);
    }

    @Override
    public Double calculatePerimeter(Double... parameters) {
        //(2*a) + (2*b)
        Double brinjaA = parameters[0];
        Double brinjaB = parameters[1];

        return (2 * brinjaA) + (2 * brinjaB);
    }

    @Override
    public Double calculateArea(Double... parameters) {
        //a * b
        Double brinjaA = parameters[0];
        Double brinjaB = parameters[1];
        return brinjaA * brinjaB;
    }
}
