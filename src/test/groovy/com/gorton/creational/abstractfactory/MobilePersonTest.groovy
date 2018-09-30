package com.gorton.creational.abstractfactory

import com.gorton.models.person.Lawyer
import com.gorton.models.person.SocialWorker
import com.gorton.models.transportation.CityBus
import com.gorton.models.transportation.Tesla
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner)
class MobilePersonTest {

    @Test
    void TestMobileLawyer() {
        def mobileLawyerFactory = new MobileLawyerFactory()
        def person = new MobilePerson(mobileLawyerFactory)
        assert person.career instanceof Lawyer
        assert person.transportation instanceof Tesla
    }

    @Test
    void TestMobileSocialWorker(){
        def mobileSocialWorkerFactory = new MobileSocialWorkerFactory()
        def person = new MobilePerson(mobileSocialWorkerFactory)
        assert person.career instanceof SocialWorker
        assert person.transportation instanceof CityBus
    }
}
