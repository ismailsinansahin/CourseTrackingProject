package com.smlsnnshn.implementation;

import com.smlsnnshn.dto.GroupDTO;
import com.smlsnnshn.entity.Group;
import com.smlsnnshn.mapper.GroupMapper;
import com.smlsnnshn.repository.GroupRepository;
import com.smlsnnshn.service.GroupService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupServiceImpl implements GroupService {

    GroupRepository groupRepository;
    GroupMapper groupMapper;

    public GroupServiceImpl(GroupRepository groupRepository, GroupMapper groupMapper) {
        this.groupRepository = groupRepository;
        this.groupMapper = groupMapper;
    }

    @Override
    public List<GroupDTO> listAllGroups() {
        List<Group> list = groupRepository.findAll(Sort.by("groupName"));
        return list.stream().map(obj-> groupMapper.convertToDTO(obj)).collect(Collectors.toList());
    }

    @Override
    public GroupDTO findByGroupName(String name) {
        Group group = groupRepository.findByGroupName(name);
        return groupMapper.convertToDTO(group);
    }

    @Override
    public Group save(GroupDTO dto) {
        Group obj = groupMapper.convertToEntity(dto);
        Group group = groupRepository.save(obj);
        return group;
    }

    @Override
    public GroupDTO update(GroupDTO dto) {
        Group group = groupRepository.findByGroupName(dto.getGroupName());
        Group convertedGroup = groupMapper.convertToEntity(dto);
        convertedGroup.setId(group.getId());
        groupRepository.save(convertedGroup);
        return findByGroupName(dto.getGroupName());
    }

    @Override
    public void delete(String name) {
        Group group = groupRepository.findByGroupName(name);
        group.setIsDeleted(true);
        groupRepository.save(group);
    }

}
