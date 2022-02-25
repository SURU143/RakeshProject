package com.example.controller;


import com.example.model.Employee;
import com.example.servise.EmployeeServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServise employeeServise;

    @PostMapping("/savedata")
    public String saveData(@RequestBody Employee employee){
        employeeServise.saveData(employee);
        return "Data Saved SucessFully";
    }
    @PostMapping("/savealldata")
    public String saveAllData(@RequestBody List<Employee> employees){
        employeeServise.saveAllData(employees);
                return "All Data Sucessfully Saved.";
    }

    @GetMapping("/getalldata")
public List<Employee> getAllData(){
        return employeeServise.getAllData();
    }

    @GetMapping("/getdatabyid/{empId}")
    public Optional<Employee> getDataById(@PathVariable int empId){
        return employeeServise.getDataById(empId);
    }

    @PutMapping("/updatedata/{empId}")
    public Employee updateData(@PathVariable int empId, @RequestBody Employee employee){
       return employeeServise.updateData(employee);

    }

    @DeleteMapping("/deletealldata")
    public String deleteAllData(){
        employeeServise.deleteAllData();
        return "Data Deleted Sucessfully";
}

@DeleteMapping("/deletedatabyid/{empId}")
    public String deleteDataById(@PathVariable int empId){
        employeeServise.deleteDataById(empId);
    return "Data Deleted Sucessfully";
}
}
