package com.custom.rest.controllers;

import java.util.List;

import com.custom.rest.beans.Student;
import com.custom.rest.beans.StudentRegistration;
import com.custom.rest.beans.StudentRegistrationReply;

import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    @GetMapping("/student/allstudents")
    public List<Student> getAllStudents() {
        return StudentRegistration.getInstance().getStudentRecords();
    }

    @PostMapping("/register/student")
    public StudentRegistrationReply registerStudent(@RequestBody Student student) {
        StudentRegistrationReply stdregreply = new StudentRegistrationReply();
        StudentRegistration.getInstance().add(student);

        stdregreply.setName(student.getName());
        stdregreply.setAge(student.getAge());
        stdregreply.setResgistrationNumber(student.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");
        
        return stdregreply;
    }

    @PutMapping("/update/student")
    public String updateStudentRecord(@RequestBody Student student){
        return StudentRegistration.getInstance().updateStudent(student);
    }

    @DeleteMapping("/delete/student/{regdNumber}")
    public String deleteStudentRecord(@PathVariable("regdNumber") String regdNum){
        return StudentRegistration.getInstance().deleteStudent(regdNum);
    }
}