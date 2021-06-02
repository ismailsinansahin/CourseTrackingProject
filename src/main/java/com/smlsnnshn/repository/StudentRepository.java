package com.smlsnnshn.repository;

import com.smlsnnshn.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);

}
