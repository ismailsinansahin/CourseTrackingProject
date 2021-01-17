package com.smlsnnshn.mapper;

import com.smlsnnshn.dto.BatchDTO;
import com.smlsnnshn.entity.Batch;
import com.smlsnnshn.repository.BatchRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BatchMapper {

    private ModelMapper modelMapper;
    private BatchRepository batchRepository;

    public BatchMapper(ModelMapper modelMapper, BatchRepository batchRepository) {
        this.modelMapper = modelMapper;
        this.batchRepository = batchRepository;
    }

    public Batch convertToEntity(BatchDTO dto){
        return modelMapper.map(dto,Batch.class);
    }

    public BatchDTO convertToDTO(Batch entity){
        return modelMapper.map(entity,BatchDTO.class);
    }

}
