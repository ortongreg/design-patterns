package com.gorton.factory

import com.gorton.models.person.Lawyer
import com.gorton.models.person.Career
import com.gorton.models.person.CareerType
import com.gorton.models.person.SocialWorker

import static CareerType.*

class CareerFactory {
    Career createPerson(CareerType type){
        type == LAWYER ? new Lawyer() : new SocialWorker()
    }
}
