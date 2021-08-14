package com.github.manimovassagh.springpostger.dao;

import com.github.manimovassagh.springpostger.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
