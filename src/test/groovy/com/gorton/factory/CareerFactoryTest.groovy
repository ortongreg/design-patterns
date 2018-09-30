package com.gorton.factory

import com.gorton.models.person.Career
import com.gorton.models.person.Lawyer
import com.gorton.models.person.SocialWorker
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

import static com.gorton.models.person.CareerType.*

@RunWith(MockitoJUnitRunner)
class CareerFactoryTest {

    CareerFactory factory = new CareerFactory()

    @Test
    void TestCreateLawyer(){
        def career = factory.createPerson(LAWYER)
        assert career instanceof Lawyer
        assert "Lawyer" == career.careerName()
    }

    @Test
    void TestCreateSocialWorker(){
        def career = factory.createPerson(SOCIAL_WORKER)
        assert career instanceof SocialWorker
        assert "Social Worker" == career.careerName()
    }
}
