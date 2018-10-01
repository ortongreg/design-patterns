package com.gorton.structural.composite

class PyramidParticipant {
    String name
    List<PyramidParticipant> underlings = []

    PyramidParticipant(String name){
        this.name = name
    }

}
