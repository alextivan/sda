package com.sda.alexivan.hibernate;

import com.sda.alexivan.hibernate.model.Department;
import com.sda.alexivan.hibernate.repository.DepartmentRepository;

public class HQLMail {
    public static void main(String[] args) {
        
        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department1 = new Department();
        department1.setName("HR");
        departmentRepository.save(department1);
    }
}
