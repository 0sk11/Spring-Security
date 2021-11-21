package com.student.app.student;

import lombok.Getter;

public class Student {

    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }


    @Getter
    private final Integer studentId;
    @Getter
    private final String studentName;


}
