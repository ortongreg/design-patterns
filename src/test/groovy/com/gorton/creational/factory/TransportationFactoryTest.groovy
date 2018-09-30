package com.gorton.creational.factory

import com.gorton.models.transportation.CityBus
import com.gorton.models.transportation.Tesla
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

import static com.gorton.models.transportation.TransportationType.*

@RunWith(MockitoJUnitRunner)
class TransportationFactoryTest {

    TransportationFactory factory = new TransportationFactory()

    @Test
    void TestCreateTesla(){
        assert factory.createTransportation(TESLA) instanceof Tesla
    }

    @Test
    void TestCreateCityBus(){
        assert factory.createTransportation(CITY_BUS) instanceof CityBus
    }
}
