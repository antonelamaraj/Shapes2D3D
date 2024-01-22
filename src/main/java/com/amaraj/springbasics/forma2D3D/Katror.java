package com.amaraj.springbasics.forma2D3D;

import org.springframework.stereotype.Component;

@Component
public class Katror implements Shape2D{

    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return "katror".equals(shapeType);
    }

    @Override
    public Double calculatePerimeter(Double... parameters) {
        //4 * a
        Double brinja = parameters[0];
        return 4 * brinja;
    }

    @Override
    public Double calculateArea(Double... parameters) {
        //a^2
        Double brinja = parameters[0];
        return Math.pow(brinja, 2);

    }


}
