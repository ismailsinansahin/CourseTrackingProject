package com.smlsnnshn.implementation;

import com.smlsnnshn.dto.StudentDTO;
import com.smlsnnshn.entity.Student;
import com.smlsnnshn.mapper.StudentMapper;
import com.smlsnnshn.repository.StudentRepository;
import com.smlsnnshn.service.StudentService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentMapper studentMapper, StudentRepository studentRepository) {
        this.studentMapper = studentMapper;
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDTO> listAllStudents() {
        List<Student> list = studentRepository.findAll(Sort.by("groupId"));
        return list.stream().map(obj -> studentMapper.convertToDTO(obj)).collect(Collectors.toList());
    }

    @Override
    public StudentDTO findByEmail(String email) {
        Student student = studentRepository.findByEmail(email);
        return studentMapper.convertToDTO(student);
    }

    @Override
    public StudentDTO findByStudentId(String studentId) {
        Long id = Long.parseLong(studentId);
        Student student = studentRepository.getOne(id);
        return studentMapper.convertToDTO(student);
    }

    @Override
    public Student save(StudentDTO dto) {
        Student obj = studentMapper.convertToEntity(dto);
        Student student = studentRepository.save(obj);
        return student;
    }

    @Override
    public StudentDTO update(StudentDTO dto) {
        Student student = studentRepository.findByEmail(dto.getEmail());
        Student convertedStudent = studentMapper.convertToEntity(dto);
        convertedStudent.setId(student.getId());
        studentRepository.save(convertedStudent);
        return findByEmail(dto.getEmail());
    }

    @Override
    public void delete(String email) {
        Student student = studentRepository.findByEmail(email);
        student.setIsDeleted(true);
        studentRepository.save(student);
    }

}
