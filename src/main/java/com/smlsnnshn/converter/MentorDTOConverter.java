package com.smlsnnshn.converter;

import com.smlsnnshn.dto.MentorDTO;
import com.smlsnnshn.service.MentorService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class MentorDTOConverter implements Converter<String, MentorDTO> {

    MentorService mentorService;

    public MentorDTOConverter(@Lazy MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @Override
    public MentorDTO convert(String source) {
        return mentorService.findByMentorId(source);
    }

}
