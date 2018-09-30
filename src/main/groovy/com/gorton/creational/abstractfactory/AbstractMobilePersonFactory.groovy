package com.gorton.creational.abstractfactory

import com.gorton.models.person.Career
import com.gorton.models.transportation.Transportation

abstract class AbstractMobilePersonFactory {
    abstract Career createCareer()
    abstract Transportation createTransportation()
}
