package com.staff.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.staff.demo.entity.DeptEntity;
import com.staff.demo.service.DeptService;

@RestController
@RequestMapping("/api/departments")
public class DeptController {

    @Autowired
    private DeptService deptService;

    // Create
    @PostMapping
    public DeptEntity createDepartment(@RequestBody DeptEntity dept) {
        return deptService.saveDepartment(dept);
    }

    // Get All
    @GetMapping
    public List<DeptEntity> getAllDepartments() {
        return deptService.getAllDepartments();
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<DeptEntity> getDepartmentById(@PathVariable Long id) {
        return deptService.getDepartmentById(id);
    }

    // Update
    @PutMapping("/{id}")
    public DeptEntity updateDepartment(@PathVariable Long id,
                                       @RequestBody DeptEntity dept) {
        return deptService.updateDepartment(id, dept);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id) {
        deptService.deleteDepartment(id);
        return "Department deleted successfully";
    }
}