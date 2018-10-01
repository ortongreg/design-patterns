package com.gorton.structural.bridge

class ListStorage implements Storage{

    private List<List<String>> lists = []

    void store(String key, String value) {
        insertOrReplace(key, value)
    }

    String retrieve(String key) {
        def item = findList(key)
         item !=null ? item[1]: null
    }

    private List findList(String key){
        lists.find{it.get(0) == key}
    }

    private insertOrReplace(String key, String value){
        lists.remove(findList(key))
        lists.add([key, value])
    }
}
