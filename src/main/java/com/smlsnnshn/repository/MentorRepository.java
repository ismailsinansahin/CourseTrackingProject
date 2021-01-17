package com.smlsnnshn.repository;

import com.smlsnnshn.entity.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorRepository extends JpaRepository<Mentor,Long> {

    Mentor findByFirstName(String name);

}
