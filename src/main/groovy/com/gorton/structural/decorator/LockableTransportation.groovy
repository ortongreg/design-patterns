package com.gorton.structural.decorator

import com.gorton.models.transportation.Transportation

class LockableTransportation extends AbstractTransportationDecorator {

    boolean locked

    LockableTransportation(Transportation transportation) {
        super(transportation)
    }

    @Override
    String goGoGo(){
        "${super.goGoGo()} while ${locked? "locked" : "unlocked"}"
    }
}
