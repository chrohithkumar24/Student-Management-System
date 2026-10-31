package com.rohith.student_management_system.mapper;

import com.rohith.student_management_system.dto.StudentDto;
import com.rohith.student_management_system.entity.Student;

public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student) {
        StudentDto studentDto = new StudentDto(
                student.getId(),
                student.getFirstname(),
                student.getLastname(),
                student.getEmail()
        );
        return studentDto;
    }
    public static Student mapToStudent(StudentDto studentDto){
        Student student = new Student(
                studentDto.getId(),
                studentDto.getFirstname(),
                studentDto.getLastname(),
                studentDto.getEmail()
        );
        return student;
    }

}
