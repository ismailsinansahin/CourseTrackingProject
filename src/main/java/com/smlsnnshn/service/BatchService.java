package com.smlsnnshn.service;

import com.smlsnnshn.dto.BatchDTO;
import com.smlsnnshn.entity.Batch;

import java.util.List;

public interface BatchService {

    List<BatchDTO> listAllBatches();
    BatchDTO findByBatchName(String name);
    BatchDTO findByBatchId(String batchID);
    Batch save(BatchDTO dto);
    BatchDTO update(BatchDTO dto);
    void delete(String name);

}
