package com.smlsnnshn.service;

import com.smlsnnshn.dto.BatchDTO;
import com.smlsnnshn.entity.Batch;

import java.util.List;

public interface BatchService {

    List<BatchDTO> listAllBatches();
    BatchDTO getByBatchName(String name);
    Batch save(BatchDTO dto);

}
