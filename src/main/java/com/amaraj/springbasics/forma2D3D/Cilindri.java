package com.amaraj.springbasics.forma2D3D;

import org.springframework.stereotype.Component;

@Component
public class Cilindri implements Shape3D{
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return "cilindri".equals(shapeType);
    }

    @Override
    public Double calculateArea(Double... parameters) {
        //2pi * rreze(rreze + lartesi)
        Double lartesia = parameters[0];
        Double rreze = parameters[1];
        return 2 * Math.PI * rreze * (rreze + lartesia);
    }

    @Override
    public Double calculateVolume(Double... parameters) {
        //        // pi * rreze * rreze * lartesi
        Double lartesia = parameters[0];
        Double rreze = parameters[1];
        return Math.PI * rreze * lartesia;
    }


//    @Override
//    public Double calculateArea(double[] parameters) {
//        //2pi * rreze(rreze + lartesi)
//        Double lartesia = parameters[0];
//        Double rreze = parameters[1];
//        return 2 * Math.PI * rreze * (rreze + lartesia);
//    }
//
//    @Override
//    public Double calculateVolume(double[] parameters) {
//        // pi * rreze * rreze * lartesi
//        Double lartesia = parameters[0];
//        Double rreze = parameters[1];
//        return Math.PI * rreze * lartesia;
//    }
}
