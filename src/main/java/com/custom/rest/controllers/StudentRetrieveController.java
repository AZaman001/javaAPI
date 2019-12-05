package com.custom.rest.controllers;

import java.util.List;

import com.custom.rest.beans.Student;
import com.custom.rest.beans.StudentRegistration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentRetrieveController {

    @RequestMapping(method = RequestMethod.GET, value="/student/allstudents")

    @ResponseBody
    public List<Student> getAllStudents() {
        return StudentRegistration.getInstance().getStudentRecords();
    }
}