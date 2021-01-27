package com.smlsnnshn.implementation;

import com.smlsnnshn.dto.BatchDTO;
import com.smlsnnshn.entity.Batch;
import com.smlsnnshn.enums.BatchStatus;
import com.smlsnnshn.mapper.BatchMapper;
import com.smlsnnshn.repository.BatchRepository;
import com.smlsnnshn.service.BatchService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BatchServiceImpl implements BatchService {

    private BatchMapper batchMapper;
    private BatchRepository batchRepository;

    public BatchServiceImpl(BatchMapper batchMapper, BatchRepository batchRepository) {
        this.batchMapper = batchMapper;
        this.batchRepository = batchRepository;
    }

    @Override
    public List<BatchDTO> listAllBatches() {
        List<Batch> list = batchRepository.findAll(Sort.by("batchName"));
        return list.stream().map(obj -> batchMapper.convertToDTO(obj)).collect(Collectors.toList());
    }

    @Override
    public Batch save(BatchDTO dto) {
        dto.setBatchStatus(BatchStatus.ACTIVE);
        Batch obj = batchMapper.convertToEntity(dto);
        Batch batch = batchRepository.save(obj);
        return batch;
    }

    @Override
    public BatchDTO update(BatchDTO dto) {
        Batch batch = batchRepository.findByBatchName(dto.getBatchName());
        Batch convertedBatch = batchMapper.convertToEntity(dto);
        convertedBatch.setId(batch.getId());
        batchRepository.save(convertedBatch);
        return findByBatchName(dto.getBatchName());

    }

    @Override
    public void delete(String name) {
        Batch batch = batchRepository.findByBatchName(name);
        batch.setIsDeleted(true);
        batchRepository.save(batch);
    }

    @Override
    public BatchDTO findByBatchName(String name) {
        Batch batch = batchRepository.findByBatchName(name);
        return batchMapper.convertToDTO(batch);
    }

}