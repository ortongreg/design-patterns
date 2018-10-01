package com.gorton.structural.composite

import org.junit.Test

class PyramidParticipantTest {

    @Test
    void TestNoUnderlings() {
        def participant = new PyramidParticipant("Phil")
        assert "Phil" == participant.name
        assert participant.underlings.isEmpty()
    }

    @Test
    void TestOneUnderling() {
        def subordinate = new PyramidParticipant("bob")
        def top = new PyramidParticipant("Phil")
        top.underlings.add(subordinate)

        assert [subordinate] == top.underlings
    }

    @Test
    void TestMultipleUnderlings_withUnderlings() {
        def bottomA = new PyramidParticipant("Alice")
        def bottomB = new PyramidParticipant("Bob")
        def bottomC = new PyramidParticipant("Charlie")
        def bottomD = new PyramidParticipant("Dave")

        def middle1 = new PyramidParticipant("Frank")
        middle1.underlings.add(bottomA)
        middle1.underlings.add(bottomB)

        def middle2 = new PyramidParticipant("Geoff")
        middle2.underlings.add(bottomC)
        middle2.underlings.add(bottomD)

        def top = new PyramidParticipant("Phil")
        top.underlings.add(middle1)
        top.underlings.add(middle2)

        assert 2 == top.underlings.size()
        assert "Frank" == top.underlings[0].name
        def frank = top.underlings[0]
        assert 2 == frank.underlings.size()
        assert "Alice" == frank.underlings[0].name
        assert "Bob" == frank.underlings[1].name

        assert "Geoff" == top.underlings[1].name
        def phil = top.underlings[1]
        assert 2 == phil.underlings.size()
        assert "Charlie" == phil.underlings[0].name
        assert "Dave" == phil.underlings[1].name
    }
}