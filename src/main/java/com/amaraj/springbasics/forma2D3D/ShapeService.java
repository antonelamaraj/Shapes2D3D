package com.amaraj.springbasics.forma2D3D;

public interface ShapeService extends Shape{

    double calculateArea2D(String type, Double... parameters);
    double calculatePerimeter2D(String type, Double... parameters);
    double calculateArea3D(String type, Double... parameters);
    double calculateVolume3D(String type, Double... parameters);
}
