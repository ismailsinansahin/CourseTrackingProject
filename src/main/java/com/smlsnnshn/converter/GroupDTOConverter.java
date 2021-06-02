package com.smlsnnshn.converter;

import com.smlsnnshn.dto.GroupDTO;
import com.smlsnnshn.service.GroupService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class GroupDTOConverter implements Converter<String,GroupDTO> {

    GroupService groupService;

    public GroupDTOConverter(@Lazy GroupService groupService) {
        this.groupService = groupService;
    }

    @Override
    public GroupDTO convert(String source) {
        return groupService.findByGroupId(source);
    }

}
