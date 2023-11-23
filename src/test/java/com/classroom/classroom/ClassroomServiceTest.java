package com.classroom.classroom;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ClassroomServiceTest {
    private ClassroomService classroomService;

    @BeforeEach
    public void setUp() {
        classroomService = new ClassroomService();
    }

    @Test
    public void testStartClass() {
    
        Teacher teacher = new Teacher("Ari");
        Subject subject = new Subject("Math");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Budi"));
        students.add(new Student("Caca"));
        students.add(new Student("Deni"));
        students.add(new Student("Elis"));

        Classroom classroom = classroomService.startClass(teacher, subject, students);

        Assertions.assertNotNull(classroom);
        Assertions.assertEquals(teacher, classroom.getTeacher());
        Assertions.assertEquals(subject, classroom.getSubject());
        Assertions.assertEquals(students, classroom.getStudent());
    }
}