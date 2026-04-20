package com.restaurante.restaurantetesting.repository;

import com.restaurante.restaurantetesting.model.Employee;
import com.restaurante.restaurantetesting.model.enums.WorkLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Duration;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllByLevel(WorkLevel level);

    // Sentencia personalizada
    @Query(value = "select (current_date - e.startDate) from Employee e where e.nif = ?1")
    Duration findWorkDaysByNif(String nif);

    List<Employee> findAllByActiveTrueAndRestaurantName(String name);

}