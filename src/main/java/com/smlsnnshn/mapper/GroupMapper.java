package com.smlsnnshn.mapper;

import com.smlsnnshn.dto.GroupDTO;
import com.smlsnnshn.entity.Group;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class GroupMapper {

    private ModelMapper modelMapper;

    public GroupMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Group convertToEntity(GroupDTO dto){
        return modelMapper.map(dto,Group.class);
    }

    public GroupDTO convertToDTO(Group entity){
        return modelMapper.map(entity,GroupDTO.class);
    }

}
