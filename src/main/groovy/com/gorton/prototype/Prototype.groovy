package com.gorton.prototype

abstract class Prototype {
    Map<String, String> child = [:]

    abstract Prototype clone()
}
