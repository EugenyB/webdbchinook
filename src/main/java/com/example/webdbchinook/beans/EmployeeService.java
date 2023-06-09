package com.example.webdbchinook.beans;

import com.example.webdbchinook.entities.SimpleEmployee;
import com.example.webdbchinook.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository repository;

    public List<SimpleEmployee> getSimpleEmployees() {
        return repository.findByIdNotNull();
    }
}
