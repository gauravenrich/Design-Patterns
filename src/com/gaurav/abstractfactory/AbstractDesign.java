package com.gaurav.abstractfactory;

public class AbstractDesign {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.MINI));
    }
}
