package com.custom.rest.controllers;

import com.custom.rest.beans.StudentRegistration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentDeleteController {

    @RequestMapping(method= RequestMethod.DELETE, value="/delete/student/{regdNumber}")

    @ResponseBody
    public String deleteStudentRecord(@PathVariable("regdNumber") String regdNum){
        return StudentRegistration.getInstance().deleteStudent(regdNum);
    }
}