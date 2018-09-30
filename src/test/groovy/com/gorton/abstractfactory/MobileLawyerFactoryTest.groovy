package com.gorton.abstractfactory

import com.gorton.models.person.Lawyer
import com.gorton.models.transportation.Tesla
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner)
class MobileLawyerFactoryTest {

    def mobileLawyerFactory = new MobileLawyerFactory()

    @Test
    void TestMobileLawyer_Career(){
        assert mobileLawyerFactory.createCareer() instanceof Lawyer
    }
    @Test
    void TestMobileLawyer_Transportation(){
        assert mobileLawyerFactory.createTransportation() instanceof Tesla
    }
}
