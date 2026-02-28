package com.staff.demo.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.staff.demo.entity.Staff;
import com.staff.demo.repository.StaffRepository;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    // Create Staff
    public Staff saveStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    // Get All Staff
    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    // Get Staff by ID
    public Staff getStaffById(Long id) {
        return staffRepository.findById(id).orElse(null);
    }

    // Delete Staff
    public void deleteStaff(Long id) {
        staffRepository.deleteById(id);
    }
}
