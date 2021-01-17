package com.smlsnnshn.converter;

import com.smlsnnshn.dto.BatchDTO;
import com.smlsnnshn.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class BatchDTOConverter implements Converter<String, BatchDTO> {

    @Autowired
    BatchService batchService;

    @Override
    public BatchDTO convert(String source) {
        return batchService.getByBatchName(source);
    }

}
