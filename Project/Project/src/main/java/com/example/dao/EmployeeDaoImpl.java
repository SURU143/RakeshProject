package com.example.dao;

import com.example.model.Employee;
import com.example.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl {
    @Autowired
    EmployeeRepo employeeRepo;

    public void saveData(Employee employee) {
        employeeRepo.save(employee);
    }

    public void saveAllData(List<Employee> employees) {
        employeeRepo.saveAll(employees);
    }

    public List<Employee> getAllData() {
    return employeeRepo.findAll();

    }

    public Optional<Employee> getDataById(int empId) {
    return employeeRepo.findById(empId);
    }

    public Employee updateData(Employee employee) {
    return employeeRepo.save(employee);
    }

    public void deleteAllData() {
 employeeRepo.deleteAll();
    }

    public void deleteDataById(int empId) {
    employeeRepo.deleteById(empId);
    }
}
