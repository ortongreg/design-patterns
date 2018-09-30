package com.gorton.abstractfactory

import com.gorton.models.person.Lawyer
import com.gorton.models.person.SocialWorker
import com.gorton.models.transportation.CityBus
import com.gorton.models.transportation.Tesla
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner)
class MobileSocialWorkerFactoryTest {

    def mobileSocialWorkerFactory = new MobileSocialWorkerFactory()

    @Test
    void TestMobileSocialWorkerFactory_Career(){
        assert mobileSocialWorkerFactory.createCareer() instanceof SocialWorker
    }
    @Test
    void TestMobileSocialWorkerFactory_Transportation(){
        assert mobileSocialWorkerFactory.createTransportation() instanceof CityBus
    }
}
