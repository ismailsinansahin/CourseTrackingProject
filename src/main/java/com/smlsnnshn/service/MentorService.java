package com.smlsnnshn.service;

import com.smlsnnshn.dto.MentorDTO;
import com.smlsnnshn.entity.Mentor;

import java.util.List;

public interface MentorService{

    List<MentorDTO> listAllMentors();
    MentorDTO findByEmail(String email);
    Mentor save(MentorDTO dto);
    MentorDTO update(MentorDTO dto);
    void delete(String email);

}
