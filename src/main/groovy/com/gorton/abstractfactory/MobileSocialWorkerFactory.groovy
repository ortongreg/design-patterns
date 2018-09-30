package com.gorton.abstractfactory

import com.gorton.models.person.Career
import com.gorton.models.person.SocialWorker
import com.gorton.models.transportation.CityBus
import com.gorton.models.transportation.Transportation

class MobileSocialWorkerFactory extends AbstractMobilePersonFactory {
    Career createCareer() { new SocialWorker() }
    Transportation createTransportation() { new CityBus() }
}
