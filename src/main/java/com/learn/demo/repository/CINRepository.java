package com.learn.demo.repository;

import com.learn.demo.repository.entity.CIN;
import com.learn.demo.repository.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CINRepository extends JpaRepository<CIN, String> {
}
