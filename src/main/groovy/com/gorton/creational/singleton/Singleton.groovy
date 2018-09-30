package com.gorton.creational.singleton

class Singleton {
    private static Singleton instance = new Singleton()

    private Singleton(){}

    static Singleton instance(){ instance }
}
