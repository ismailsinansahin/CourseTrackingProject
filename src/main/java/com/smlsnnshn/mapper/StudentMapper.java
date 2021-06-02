package com.smlsnnshn.mapper;

import com.smlsnnshn.dto.StudentDTO;
import com.smlsnnshn.entity.Student;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private ModelMapper modelMapper;

    public StudentMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Student convertToEntity(StudentDTO dto){
        return modelMapper.map(dto, Student.class);
    }

    public StudentDTO convertToDTO(Student entity){
        return modelMapper.map(entity,StudentDTO.class);
    }

}
