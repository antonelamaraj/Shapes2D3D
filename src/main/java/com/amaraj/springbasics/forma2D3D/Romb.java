package com.amaraj.springbasics.forma2D3D;

import org.springframework.stereotype.Component;

@Component
public class Romb implements  Shape2D{

    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return "romb".equals(shapeType);
    }

    @Override
    public Double calculatePerimeter(Double... parameters) {
        //: perimetri = 4 * A
        Double brinja = parameters[0];
        return 4 * brinja;
    }

    @Override
    public Double calculateArea(Double... parameters) {
        //siperfaqja = (D1 * D2) ÷ 2
        Double d1 = parameters[0];
        Double d2 = parameters[1];
        return (d2 * d1) / 2;
    }
}
