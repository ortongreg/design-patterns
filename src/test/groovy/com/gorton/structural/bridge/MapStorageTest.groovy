package com.gorton.structural.bridge

import org.junit.Before
import org.junit.Test

class MapStorageTest {

    def storage

    @Before
    void SetUp(){
        storage = new MapStorage()
    }

    @Test
    void TestRetrieve() {
        storage.store("k1", "v1")
        assert "v1" == storage.retrieve("k1")
    }

    @Test
    void TestRetrieve_Overwrite() {
        storage.store("k1", "v1")
        storage.store("k1", "v2")
        assert "v2" == storage.retrieve("k1")
    }

    @Test
    void TestRetrieve_Multiple() {
        storage.store("k1", "v1")
        storage.store("k2", "v2")
        assert "v1" == storage.retrieve("k1")
        assert "v2" == storage.retrieve("k2")
    }

    @Test
    void TestRetrieve_NotThere() {
        assert null == storage.retrieve("k1")
    }
}
