package com.gorton.structural.decorator

import com.gorton.models.transportation.Transportation

abstract class AbstractTransportationDecorator implements Transportation {
    private Transportation transportation

    AbstractTransportationDecorator(Transportation transportation){
        this.transportation = transportation
    }

    String goGoGo(){ transportation.goGoGo()}
}
