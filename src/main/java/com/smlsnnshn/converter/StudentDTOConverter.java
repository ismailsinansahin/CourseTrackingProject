package com.smlsnnshn.converter;

import com.smlsnnshn.dto.StudentDTO;
import com.smlsnnshn.service.StudentService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class StudentDTOConverter implements Converter<String, StudentDTO> {

    StudentService studentService;

    public StudentDTOConverter(@Lazy StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public StudentDTO convert(String source) {
        return studentService.findByStudentId(source);
    }

}
