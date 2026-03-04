package com.staff.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.staff.demo.entity.DeptEntity;
import com.staff.demo.repository.DeptRepository;

@Service
public class DeptService {

    @Autowired
    private DeptRepository deptRepository;

    // Create Department
    public DeptEntity saveDepartment(DeptEntity dept) {
        return deptRepository.save(dept);
    }

    // Get All Departments
    public List<DeptEntity> getAllDepartments() {
        return deptRepository.findAll();
    }

    // Get By Id
    public Optional<DeptEntity> getDepartmentById(Long id) {
        return deptRepository.findById(id);
    }

    // Update Department
    public DeptEntity updateDepartment(Long id, DeptEntity updatedDept) {
        DeptEntity dept = deptRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));

        dept.setDeptName(updatedDept.getDeptName());
        dept.setDeptCode(updatedDept.getDeptCode());
        dept.setLocation(updatedDept.getLocation());

        return deptRepository.save(dept);
    }

    // Delete
    public void deleteDepartment(Long id) {
        deptRepository.deleteById(id);
    }
}