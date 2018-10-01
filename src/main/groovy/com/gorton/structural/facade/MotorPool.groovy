package com.gorton.structural.facade

import com.gorton.models.transportation.CityBus
import com.gorton.models.transportation.Tesla
import com.gorton.models.transportation.Transportation
import com.gorton.structural.decorator.PaintableTransportation

class MotorPool {

    private static MotorPool instance = new MotorPool()
    private Set<PaintableTransportation> transports
    private MotorPool(){
        instance = this
        transports = [
                bus("Blue"),
                bus("Green"),
                bus("Red"),
                tesla("Silver"),
                tesla("Red"),
                tesla("Silver"),
                tesla("Red"),
                tesla("Black")
        ]
    }

    static instance(){ instance }

    Set<Transportation> allTransports(){ transports }

    private PaintableTransportation bus(String color){ paintableTransport( new CityBus(), color) }

    private PaintableTransportation tesla(String color){ paintableTransport( new Tesla(), color) }

    private PaintableTransportation paintableTransport(Transportation transport, String color){
        def paintable = new PaintableTransportation(transport)
        paintable.paint(color)
        paintable
    }
}
