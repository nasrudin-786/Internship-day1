package com.example.employeecrud.repository;

import com.example.employeecrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {

    List<Employee> findByDepartmentAndStatus(String department, String status);

    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN :min AND :max")
    List<Employee> findEmployeesBySalaryRange(@Param("min") BigDecimal min, @Param("max") BigDecimal max);

    List<Employee> findByNameContainingAndDepartment(String name, String department);

    List<Employee> findByCreatedAtBetween(LocalDateTime start, LocalDateTime end);
}
