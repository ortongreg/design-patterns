package com.gorton.structural.bridge

class User {
    Storage storage
    private String username
    private String password
    private final String UKEY = "USERNAME"
    private final String PKEY = "PASSWORD"

    void setUsername(String username){
        this.username = username
    }

    String getUsername(){
        storage.retrieve(UKEY)
    }

    void setPassword(String password){
        this.password = password
    }

    String getPassword(){
        storage.retrieve(PKEY)
    }

    void save(){
        storage.store(UKEY, username)
        storage.store(PKEY, password)
    }
}
