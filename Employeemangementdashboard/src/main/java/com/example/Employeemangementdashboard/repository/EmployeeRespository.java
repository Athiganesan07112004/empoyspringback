package com.example.Employeemangementdashboard.repository;

import com.example.Employeemangementdashboard.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee,Long> {
}
