package com.amaraj.springbasics.forma2D3D;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShapeDemo implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(ShapeDemo.class);
    private final ShapeService shapeService;

    @Autowired
    public ShapeDemo(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @Override
    public void run(String... args) throws Exception {

        //sip katror
        String shapeType = "katror";
        Double length = 5.0;
        double area = shapeService.calculateArea2D(shapeType, length);
        double katrorPer = shapeService.calculatePerimeter2D(shapeType, length);
        logger.info("Area of {} me brinje {}: {}", shapeType, length, area);
        logger.info("Perimeter of {} me brinje {}: {}", shapeType, length, katrorPer);


        //drejtkendesh
        String shapeType1 = "drejtkendesh";
        Double lengtha = 5.0;
        Double lengthb = 2.5;
        double area1 = shapeService.calculateArea2D(shapeType1, lengtha, lengthb);
        double drejtkendeshPer = shapeService.calculatePerimeter2D(shapeType1, lengtha, lengthb);
        logger.info("{}*{}={}", lengtha, lengthb, area1);
        logger.info("{}*{}={}", lengtha, lengthb, drejtkendeshPer);

        //trekendesh
        String shapeType3 = "trekendesh";
        Double lengtht1 = 3.0;
        Double lengtht2 = 2.0;
        Double lengtht3 = 2.0;
        double trekendeshSip = shapeService.calculateArea2D(shapeType3, lengtht1, lengtht2, lengtht3);
        double trekendeshPerim = shapeService.calculatePerimeter2D(shapeType3, lengtht1, lengtht2, lengtht3);
        // logger.info("{}*{}*{}={}", lengtht1, lengtht2,lengtht3, trekendeshSip);
        logger.info("{}+{}+{}={}", lengtht1, lengtht2, lengtht3, trekendeshPerim);


        //3D
        //sip katror
        String shapeKub = "kubi";
        Double lengthK = 5.0;
        double areaK = shapeService.calculateArea3D(shapeKub, lengthK);
        double vellimiKub = shapeService.calculateVolume3D(shapeKub, lengthK);
        logger.info("Sip of {} me brinje {}= {}", shapeKub, lengthK, areaK);
        logger.info("Vellimi of {} me brinje {}: {}", shapeKub, lengthK, vellimiKub);


    }


    /*
    *   public Double getResult(String shape, Double...parameters){
        return shapeServ`ice.stream()
                .filter(fi->fi.isShapeTypeSupported(shape))
                .findFirst().orElseThrow(()->new RuntimeException("Shape is not supported"))
                .calculateArea2D(String.valueOf(parameters));  }
    * */

}
