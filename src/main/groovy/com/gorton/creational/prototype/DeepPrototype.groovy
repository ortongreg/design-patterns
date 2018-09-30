package com.gorton.creational.prototype

class DeepPrototype extends Prototype {
    Prototype clone() {
        Prototype clone = new DeepPrototype()
        clone.child = child.clone() as Map<String, String>
        clone
    }
}
