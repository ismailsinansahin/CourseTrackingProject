package com.smlsnnshn.service;

import com.smlsnnshn.dto.MentorDTO;
import com.smlsnnshn.entity.Mentor;

import java.util.List;

public interface MentorService{

    List<MentorDTO> listAllMentors();
    MentorDTO getByFirstName(String name);
    Mentor save(MentorDTO dto);

}
