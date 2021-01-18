package com.smlsnnshn.converter;

import com.smlsnnshn.dto.MentorDTO;
import com.smlsnnshn.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class MentorDTOConverter implements Converter<String, MentorDTO> {

    @Autowired
    MentorService mentorService;

    @Override
    public MentorDTO convert(String source) {
        return mentorService.getByFirstName(source);
    }

}
