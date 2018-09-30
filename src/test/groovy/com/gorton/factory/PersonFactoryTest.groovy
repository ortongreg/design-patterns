package com.gorton.factory

import com.gorton.models.person.Lawyer
import com.gorton.models.person.SocialWorker
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

import static com.gorton.models.person.PersonType.*

@RunWith(MockitoJUnitRunner)
class PersonFactoryTest {

    PersonFactory factory = new PersonFactory()

    @Test
    void TestCreateLawyer(){
        assert factory.createPerson(LAWYER) instanceof Lawyer
    }

    @Test
    void TestCreateSocialWorker(){
        assert factory.createPerson(SOCIAL_WORKER) instanceof SocialWorker
    }
}
