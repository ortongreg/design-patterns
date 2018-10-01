package com.gorton.structural.facade

import org.junit.Test

class MotorPoolFacadeTest {

    @Test
    void Test_Tesla_IsCar() {
        MotorPoolFacade facade = new MotorPoolFacade()
        assert 2 == facade.NumberOfRedTeslas()
    }
}