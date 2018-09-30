package com.gorton.prototype

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner)
class DeepPrototypeTest {

    @Test
    void TestClone_copiesChild(){
        Prototype deep = new DeepPrototype()

        deep.child["testItem"] = "testValue"

        Prototype clone = deep.clone()

        assert clone.child.testItem == "testValue"
    }

    @Test
    void TestClone_isADeepCopy(){
        Prototype deep = new DeepPrototype()

        deep.child["testItem"] = "testValue"

        Prototype clone = deep.clone()

        clone.child.testItem = "changedValue"
        assert clone.child.testItem == "changedValue"
        assert deep.child.testItem == "testValue"

    }
}
