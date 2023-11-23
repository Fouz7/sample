package com.classroom.classroom;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Classroom {
    
    private Teacher teacher;
    private Subject subject;
    private List<Student> student;
}
