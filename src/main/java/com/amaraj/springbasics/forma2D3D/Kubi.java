package com.amaraj.springbasics.forma2D3D;

import org.springframework.stereotype.Component;

@Component
public class Kubi implements Shape3D{
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return "kubi".equals(shapeType);
    }

    @Override
    public Double calculateArea(Double... parameters) {
        //6(a*a)
        Double brinja = parameters[0];
        return 6 * (brinja * brinja);
    }

    @Override
    public Double calculateVolume(Double... parameters) {
        // a*a*a
        Double brinja = parameters[0];
        return Math.pow(brinja, 3);
    }
}
