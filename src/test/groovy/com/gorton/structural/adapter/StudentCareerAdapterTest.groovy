package com.gorton.structural.adapter

import com.gorton.models.person.Career
import com.gorton.models.person.Student
import com.gorton.structural.adapter.StudentCareerAdapter
import org.junit.Test

class StudentCareerAdapterTest {

    @Test
    void TestAdaptToCareer() {
        def student = new Student("Computer Science")
        Career adapter = new StudentCareerAdapter(student)
        assert "Computer Science" == adapter.careerName()
    }
}
