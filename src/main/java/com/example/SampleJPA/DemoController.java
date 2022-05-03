package com.example.SampleJPA;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class DemoController {
    @Autowired
    EmployeeRepository empRepository;
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        List<Employee> emplist=employeeService.findAll();
        System.out.println(emplist);
        model.addAttribute("employeelist", emplist);
        return "indexDB";
    }

    //TODO:以下は動くか試してみる
    @RequestMapping(value = "/findone", method = RequestMethod.GET)
    public String index2(Model model) {
        Optional<Employee> emplist= employeeService.findOne(1);
        model.addAttribute("employeelist", emplist);

        return "indexDB";
    }
}
