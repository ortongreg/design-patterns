package com.gorton.prototype

class ShallowPrototype extends Prototype {
    Prototype clone() {
        Prototype clone = new ShallowPrototype()
        clone.child = child
        clone
    }
}
