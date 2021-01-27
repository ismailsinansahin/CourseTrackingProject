package com.smlsnnshn.repository;

import com.smlsnnshn.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

    public Group findByGroupName(String name);

}
