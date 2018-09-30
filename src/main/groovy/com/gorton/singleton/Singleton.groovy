package com.gorton.singleton

class Singleton {
    private static Singleton instance = new Singleton()

    private Singleton(){}

    static Singleton instance(){ instance }
}
