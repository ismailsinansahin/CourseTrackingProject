package com.smlsnnshn.repository;

import com.smlsnnshn.entity.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface MentorRepository extends JpaRepository<Mentor,Long> {

    Mentor findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);

}
