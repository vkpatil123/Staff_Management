package com.staff.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.staff.demo.entity.DeptEntity;

public interface DeptRepository extends JpaRepository<DeptEntity, Long> {

    //DeptEntity findByDeptCode(String deptCode);
}