package com.gorton.singleton


import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner)
class SingletonTest {

    @Test
    void TestInstance(){
        Singleton singleton = Singleton.instance()
        assert singleton instanceof Singleton
    }
}
