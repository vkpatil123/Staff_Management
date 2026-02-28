package com.staff.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.staff.demo.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {

}
