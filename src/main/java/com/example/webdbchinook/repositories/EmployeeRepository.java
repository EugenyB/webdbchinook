package com.example.webdbchinook.repositories;

import com.example.webdbchinook.entities.Employee;
import com.example.webdbchinook.entities.SimpleEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<SimpleEmployee> findByIdNotNull();

}