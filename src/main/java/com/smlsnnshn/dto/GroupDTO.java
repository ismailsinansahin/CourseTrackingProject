package com.smlsnnshn.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class GroupDTO {

    private Long groupId;
    private String groupName;
    private String groupMascot;
    private BatchDTO batch;
    private MentorDTO mentor;

}
