package com.spring.study.services;

import com.spring.study.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rameshkale on 26/02/17.
 */
@Controller
public class SubmitFormSample {
    List<Employee> employees = new ArrayList<>();

    @RequestMapping(value = "/employeesform", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody List<Employee> insertEmployee(HttpServletRequest httpServletRequest){
        System.out.println("httpServletRequest.getParameter(\"name\") = " + httpServletRequest.getParameter("name"));
        return employees;
    }
}
