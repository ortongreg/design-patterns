package com.gorton.structural.bridge

interface Storage {
    void store(String key, String value)
    String retrieve(String key)
}