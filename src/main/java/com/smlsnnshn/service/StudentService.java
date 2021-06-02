package com.smlsnnshn.service;

import com.smlsnnshn.dto.StudentDTO;
import com.smlsnnshn.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<StudentDTO> listAllStudents();
    StudentDTO findByEmail(String email);
    StudentDTO findByStudentId(String studentId);
    Student save(StudentDTO dto);
    StudentDTO update(StudentDTO dto);
    void delete(String email);

}
