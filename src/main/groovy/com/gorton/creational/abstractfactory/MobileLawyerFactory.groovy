package com.gorton.creational.abstractfactory

import com.gorton.models.person.Career
import com.gorton.models.person.Lawyer
import com.gorton.models.transportation.Tesla
import com.gorton.models.transportation.Transportation

class MobileLawyerFactory extends AbstractMobilePersonFactory{
    Career createCareer() { new Lawyer() }
    Transportation createTransportation() { new Tesla() }
}
