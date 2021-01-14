package com.smlsnnshn.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BatchDTO {

    private Long batchId;
    private String batchName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate batchStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate batchEndDate;
    private String batchNotes;

}
