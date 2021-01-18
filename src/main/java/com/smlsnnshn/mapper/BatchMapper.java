package com.smlsnnshn.mapper;

import com.smlsnnshn.dto.BatchDTO;
import com.smlsnnshn.entity.Batch;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BatchMapper {

    private ModelMapper modelMapper;

    public BatchMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Batch convertToEntity(BatchDTO dto){
        return modelMapper.map(dto,Batch.class);
    }

    public BatchDTO convertToDTO(Batch entity){
        return modelMapper.map(entity,BatchDTO.class);
    }

}
