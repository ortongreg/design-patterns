package com.gorton.structural.decorator

import com.gorton.models.transportation.CityBus
import com.gorton.models.transportation.Tesla
import org.junit.Test

class TransportationDecoratorTest {

    @Test
    void TestPaintableTransportation() {
        def bus = new CityBus()
        PaintableTransportation paintableBus = new PaintableTransportation(bus)
        paintableBus.paint("blue")

        assert "rumble rumble stop while blue" == paintableBus.goGoGo()
    }

    @Test
    void TestLockableTransportation() {
        def car = new Tesla()
        LockableTransportation lockableCar = new LockableTransportation(car)
        lockableCar.locked = false

        assert "bizz zap vroom while unlocked" == lockableCar.goGoGo()
    }

    @Test
    void TestPaintableLockableTransportation() {
        def car = new Tesla()
        PaintableTransportation paintableCar = new PaintableTransportation(car)
        paintableCar.paint("red")
        LockableTransportation lockableCar = new LockableTransportation(paintableCar)
        lockableCar.locked = true

        assert "bizz zap vroom while red while locked" == lockableCar.goGoGo()
    }
}