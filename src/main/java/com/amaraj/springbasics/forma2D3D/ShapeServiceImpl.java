package com.amaraj.springbasics.forma2D3D;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShapeServiceImpl implements ShapeService{
        @Autowired
        private List<Shape2D> shape2DList;

        @Autowired
        private List<Shape3D> shape3DList;


    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return shape2DList.stream().anyMatch(shape -> shape.isShapeTypeSupported(shapeType))
                || shape3DList.stream().anyMatch(shape -> shape.isShapeTypeSupported(shapeType));
    }

    @Override
    public double calculateArea2D(String type, Double... parameters) {
        return shape2DList.stream()
                .filter(shape -> shape.isShapeTypeSupported(type))
                .findFirst()
                .map(shape -> shape.calculateArea(parameters))
                .orElseThrow(() -> new RuntimeException("Shape not supported"));
    }

    @Override
    public double calculatePerimeter2D(String type, Double... parameters) {
        return shape2DList.stream()
                .filter(shape -> shape.isShapeTypeSupported(type))
                .findFirst()
                .map(shape -> shape.calculatePerimeter(parameters))
                .orElseThrow(() -> new RuntimeException("Shape not supported"));
    }


    @Override
    public double calculateArea3D(String type, Double... parameters) {
        return shape3DList.stream()
                .filter(shape -> shape.isShapeTypeSupported(type))
                .findFirst()
                .map(shape -> shape.calculateArea(parameters))
                .orElseThrow(() -> new RuntimeException("Shape not supported"));
    }

    @Override
    public double calculateVolume3D(String type, Double... parameters) {
        return shape3DList.stream()
                .filter(shape -> shape.isShapeTypeSupported(type))
                .findFirst()
                .map(shape -> shape.calculateVolume(parameters))
                .orElseThrow(() -> new RuntimeException("Shape not supported"));
    }



}