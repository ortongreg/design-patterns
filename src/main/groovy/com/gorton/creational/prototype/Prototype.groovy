package com.gorton.creational.prototype

abstract class Prototype {
    Map<String, String> child = [:]

    abstract Prototype clone()
}
