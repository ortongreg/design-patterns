package com.gorton.structural.facade

import com.gorton.models.transportation.Transportation
import com.gorton.structural.decorator.PaintableTransportation

class TransportationUtil {
    static boolean isCar(Transportation transport){
        transport.goGoGo().startsWith("bizz zap vroom")
    }
    static boolean isRed(PaintableTransportation transport){
        "Red" == transport.color
    }
}
