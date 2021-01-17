package com.smlsnnshn.mapper;

import com.smlsnnshn.dto.BatchDTO;
import com.smlsnnshn.dto.MentorDTO;
import com.smlsnnshn.entity.Batch;
import com.smlsnnshn.entity.Mentor;
import com.smlsnnshn.repository.BatchRepository;
import com.smlsnnshn.repository.MentorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MentorMapper {

    private ModelMapper modelMapper;
    private MentorRepository mentorRepository;

    public MentorMapper(ModelMapper modelMapper, MentorRepository mentorRepository) {
        this.modelMapper = modelMapper;
        this.mentorRepository = mentorRepository;
    }

    public Mentor convertToEntity(MentorDTO dto){
        return modelMapper.map(dto,Mentor.class);
    }

    public MentorDTO convertToDTO(Mentor entity){
        return modelMapper.map(entity,MentorDTO.class);
    }
}
