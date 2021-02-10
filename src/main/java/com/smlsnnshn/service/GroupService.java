package com.smlsnnshn.service;

import com.smlsnnshn.dto.GroupDTO;
import com.smlsnnshn.entity.Group;

import java.util.List;

public interface GroupService {

    List<GroupDTO> listAllGroups();
    GroupDTO findByGroupName(String name);
    Group save(GroupDTO dto);
    GroupDTO update(GroupDTO dto);
    void delete(String name);

}
