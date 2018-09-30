package com.gorton.abstractfactory

import com.gorton.models.person.Career
import com.gorton.models.transportation.Transportation

class MobilePerson {
    Career career
    Transportation transportation

    MobilePerson(AbstractMobilePersonFactory factory){
        career = factory.createCareer()
        transportation = factory.createTransportation()
    }
}
