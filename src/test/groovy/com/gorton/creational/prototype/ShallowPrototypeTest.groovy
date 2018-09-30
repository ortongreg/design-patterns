package com.gorton.creational.prototype

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner)
class ShallowPrototypeTest {

    @Test
    void TestClone_copiesChild(){
        Prototype shallow = new ShallowPrototype()

        shallow.child["testItem"] = "testValue"

        Prototype clone = shallow.clone()

        assert clone.child.testItem == "testValue"
    }

    @Test
    void TestClone_isAShallowCopy(){
        Prototype shallow = new ShallowPrototype()

        shallow.child["testItem"] = "testValue"

        Prototype clone = shallow.clone()

        clone.child.testItem = "changedValue"
        assert clone.child.testItem == "changedValue"
        assert shallow.child.testItem == "changedValue"

    }
}
