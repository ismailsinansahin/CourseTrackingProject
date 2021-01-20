package com.smlsnnshn.implementation;

import com.smlsnnshn.dto.MentorDTO;
import com.smlsnnshn.entity.Mentor;
import com.smlsnnshn.mapper.MentorMapper;
import com.smlsnnshn.repository.MentorRepository;
import com.smlsnnshn.service.MentorService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MentorServiceImpl implements MentorService {

    private MentorMapper mentorMapper;
    private MentorRepository mentorRepository;

    public MentorServiceImpl(MentorMapper mentorMapper, MentorRepository mentorRepository) {
        this.mentorMapper = mentorMapper;
        this.mentorRepository = mentorRepository;
    }

    @Override
    public List<MentorDTO> listAllMentors() {
        List<Mentor> list = mentorRepository.findAll(Sort.by("firstName"));
        return list.stream().map(obj -> mentorMapper.convertToDTO(obj)).collect(Collectors.toList());
    }

    @Override
    public Mentor save(MentorDTO dto) {
        Mentor obj = mentorMapper.convertToEntity(dto);
        Mentor mentor = mentorRepository.save(obj);
        return mentor;
    }

    @Override
    public MentorDTO update(MentorDTO dto) {
        Mentor mentor = mentorRepository.findByEmail(dto.getEmail());
        Mentor convertedMentor = mentorMapper.convertToEntity(dto);
        convertedMentor.setId(mentor.getId());
        mentorRepository.save(convertedMentor);
        return findByEmail(dto.getEmail());
    }

    @Override
    public MentorDTO findByEmail(String email) {
        Mentor mentor = mentorRepository.findByEmail(email);
        return mentorMapper.convertToDTO(mentor);
    }

}
