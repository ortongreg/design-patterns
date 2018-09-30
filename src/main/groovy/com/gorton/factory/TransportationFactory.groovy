package com.gorton.factory

import com.gorton.models.transportation.CityBus
import com.gorton.models.transportation.Tesla
import com.gorton.models.transportation.Transportation
import com.gorton.models.transportation.TransportationType

import static com.gorton.models.transportation.TransportationType.*

class TransportationFactory {
    Transportation createTransportation(TransportationType type){
        type == TESLA ? new Tesla() : new CityBus()
    }
}
