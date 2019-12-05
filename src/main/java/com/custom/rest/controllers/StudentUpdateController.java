package com.custom.rest.controllers;

import com.custom.rest.beans.Student;
import com.custom.rest.beans.StudentRegistration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentUpdateController {
    
    @RequestMapping(method = RequestMethod.PUT, value="/update/student")

    @ResponseBody
    public String updateStudentRecord(@RequestBody Student student){
        return StudentRegistration.getInstance().updateStudent(student);
    }
}