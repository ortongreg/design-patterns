package com.gorton.structural.facade

class MotorPoolFacade {
    int NumberOfRedTeslas(){
        MotorPool.instance().allTransports()
            .findAll{ TransportationUtil.isCar(it) }
            .findAll{ TransportationUtil.isRed(it) }
            .size()
    }
}
