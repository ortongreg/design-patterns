package com.gorton.structural.bridge

import org.junit.Test

class UserTest {

    def mapStorage = new MapStorage()
    def listStorage = new ListStorage()

    @Test
    void TestStorageBridge() {
        def user = new User()

        user.storage = mapStorage
        user.username = "testU1"
        user.password = "testP1"
        user.save()

        user.storage = listStorage
        user.username = "testU2"
        user.password = "testP2"
        user.save()

        assert "testU2" == user.username
        assert "testP2" == user.password

        user.storage = mapStorage
        assert "testU1" == user.username
        assert "testP1" == user.password
    }
}
