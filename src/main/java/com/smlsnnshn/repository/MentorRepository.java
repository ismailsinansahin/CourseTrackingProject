package com.smlsnnshn.repository;

import com.smlsnnshn.entity.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository extends JpaRepository<Mentor,Long> {

    Mentor findByEmail(String email);

}
