package com.smlsnnshn.mapper;

import com.smlsnnshn.dto.MentorDTO;
import com.smlsnnshn.entity.Mentor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MentorMapper {

    private ModelMapper modelMapper;

    public MentorMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Mentor convertToEntity(MentorDTO dto){
        return modelMapper.map(dto,Mentor.class);
    }

    public MentorDTO convertToDTO(Mentor entity){
        return modelMapper.map(entity,MentorDTO.class);
    }

}
