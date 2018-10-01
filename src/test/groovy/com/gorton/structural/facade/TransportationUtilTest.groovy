package com.gorton.structural.facade

import com.gorton.models.transportation.CityBus
import com.gorton.models.transportation.Tesla
import com.gorton.structural.decorator.PaintableTransportation
import org.junit.Test

class TransportationUtilTest {

    @Test
    void Test_Tesla_IsCar() {
        def car = new Tesla()
        assert TransportationUtil.isCar(car)
    }

    @Test
    void Test_CityBus_Not_IsCar() {
        def bus = new CityBus()
        assert !TransportationUtil.isCar(bus)
    }

    @Test
    void Test_RedCar_IsRed() {
        def car = new PaintableTransportation(new Tesla())
        car.paint("Red")
        assert TransportationUtil.isRed(car)
    }

    @Test
    void Test_BlueCar_NOT_IsRed() {
        def car = new PaintableTransportation(new Tesla())
        car.paint("Blue")
        assert !TransportationUtil.isRed(car)
    }

    @Test
    void Test_RedBus_IsRed() {
        def bus = new PaintableTransportation(new CityBus())
        bus.paint("Red")
        assert TransportationUtil.isRed(bus)
    }
}