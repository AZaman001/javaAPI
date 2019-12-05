package com.custom.rest.controllers;

import com.custom.rest.beans.Student;
import com.custom.rest.beans.StudentRegistration;
import com.custom.rest.beans.StudentRegistrationReply;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentRegistrationController {

    @RequestMapping(method= RequestMethod.POST, value ="/register/student")

    @ResponseBody
    public StudentRegistrationReply registerStudent(@RequestBody Student student) {
        StudentRegistrationReply stdregreply = new StudentRegistrationReply();
        StudentRegistration.getInstance().add(student);

        stdregreply.setName(student.getName());
        stdregreply.setAge(student.getAge());
        stdregreply.setResgistrationNumber(student.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");
        
        return stdregreply;
    }
}