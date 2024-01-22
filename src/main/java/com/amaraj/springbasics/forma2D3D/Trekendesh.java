package com.amaraj.springbasics.forma2D3D;

import org.springframework.stereotype.Component;

@Component
public class Trekendesh implements Shape2D{
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return "trekendesh".equals(shapeType);
    }

    @Override
    public Double calculatePerimeter(Double... parameters) {
        //a + b+ c
        Double brinja1 = parameters[0];
        Double brinja2 = parameters[1];
        Double brinja3 = parameters[2];
        return (brinja1 + brinja2 + brinja3);
    }

    @Override
    public Double calculateArea(Double... parameters) {
        // siperfaqja = (baze * lartesi) ÷ 2
        Double baza = parameters[0];
        Double lartesia = parameters[1];

        return (baza * lartesia) / 2;
    }
}
