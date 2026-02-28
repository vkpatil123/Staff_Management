package com.staff.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.staff.demo.entity.Staff;
import com.staff.demo.service.StaffService;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    // 1️⃣ Create Staff
    @PostMapping
    public Staff createStaff(@RequestBody Staff staff) {
        return staffService.saveStaff(staff);
    }

    // 2️⃣ Get All Staff
    @GetMapping
    public List<Staff> getAllStaff() {
        return staffService.getAllStaff();
    }

    // 3️⃣ Get Staff by ID
    @GetMapping("/{id}")
    public Staff getStaffById(@PathVariable Long id) {
        return staffService.getStaffById(id);
    }

    // 4️⃣ Delete Staff
    @DeleteMapping("/{id}")
    public String deleteStaff(@PathVariable Long id) {

        staffService.deleteStaff(id);
        return "Staff deleted successfully!";
    }
}