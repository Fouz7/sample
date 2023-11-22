package com.classroom.classroom;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClassroomService {
    public Classroom startClass(Teacher teacher, Subject subject, List<Student> student) {
       return new Classroom(teacher, subject, student);
    }
}
