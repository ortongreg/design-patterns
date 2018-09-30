package com.gorton.factory

import com.gorton.models.person.Lawyer
import com.gorton.models.person.Person
import com.gorton.models.person.PersonType
import com.gorton.models.person.SocialWorker

import static com.gorton.models.person.PersonType.*

class PersonFactory {
    Person createPerson(PersonType type){
        type == LAWYER ? new Lawyer() : new SocialWorker()
    }
}
