package com.gorton.structural.decorator

import com.gorton.models.transportation.Transportation

class PaintableTransportation extends AbstractTransportationDecorator {

    private String color

    PaintableTransportation(Transportation transportation) {
        super(transportation)
    }

    void paint(String color){
        this.color = color
    }

    String getColor(){ color }

    @Override
    String goGoGo(){
        "${super.goGoGo()} while ${color}"
    }
}
