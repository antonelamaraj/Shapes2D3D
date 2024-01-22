package com.amaraj.springbasics.forma2D3D;

import org.springframework.stereotype.Component;

@Component
public class Kuboidi implements Shape3D{
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return "kuboidi".equals(shapeType);
    }

    @Override
    public Double calculateArea(Double... parameters) {
        //siperfaqja = 2 ( (A* lartesi) + (B * lartesi) + (A *B))
        Double brinjaA = parameters[0];
        Double brinjaB = parameters[1];
        Double lartesia = parameters[2];
        return 2 * ((brinjaA * lartesia) + (brinjaB * lartesia) + (brinjaA * brinjaB));
    }

    @Override
    public Double calculateVolume(Double... parameters) {
        //vellimi = A * B * lartesi,
        Double brinjaA = parameters[0];
        Double brinjaB = parameters[1];
        Double lartesia = parameters[2];
        return (brinjaA * brinjaB * lartesia);
    }
}
