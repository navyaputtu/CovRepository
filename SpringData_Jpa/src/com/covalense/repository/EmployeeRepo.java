package com.covalense.repository;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.stereotype.Repository;

import com.covalense.beans.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	

}