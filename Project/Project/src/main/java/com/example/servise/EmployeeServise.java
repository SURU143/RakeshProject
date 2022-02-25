package com.example.servise;

import com.example.dao.EmployeeDaoImpl;
import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServise {

@Autowired
    EmployeeDaoImpl employeeDao;

    public void saveData(Employee employee) {
        employeeDao.saveData(employee);
    }

    public void saveAllData(List<Employee> employees) {
        employeeDao.saveAllData(employees);
    }

    public List<Employee> getAllData() {
    return employeeDao.getAllData();
    }

    public Optional<Employee> getDataById(int empId) {
        return employeeDao.getDataById(empId);
    }

    public Employee updateData(Employee employee) {
    return employeeDao.updateData(employee);
    }

    public void deleteAllData() {
    employeeDao.deleteAllData();}

    public void deleteDataById(int empId) {
    employeeDao.deleteDataById(empId);

    }
}
