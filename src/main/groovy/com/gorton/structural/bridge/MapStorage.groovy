package com.gorton.structural.bridge

class MapStorage implements Storage{
    private Map<String, String> store = [:]

    void store(String key, String value) {
        store[key] = value
    }

    String retrieve(String key) {
        store[key]
    }
}
