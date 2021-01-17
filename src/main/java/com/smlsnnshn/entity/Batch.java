package com.smlsnnshn.entity;

import com.smlsnnshn.enums.BatchStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "batches")
public class Batch extends BaseEntity{

    private String batchName;
    private LocalDate batchStartDate;
    private LocalDate batchEndDate;
    private String batchNotes;
    @Enumerated(EnumType.STRING)
    private BatchStatus batchStatus;

}
