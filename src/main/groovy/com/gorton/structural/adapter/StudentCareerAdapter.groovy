package com.gorton.structural.adapter

import com.gorton.models.person.Career
import com.gorton.models.person.Student

class StudentCareerAdapter implements Career {
    Student student

    StudentCareerAdapter(Student student){
        this.student = student
    }

    String careerName() {
        student.fieldOfStudy
    }
}
