package com.smlsnnshn.dto;

import com.smlsnnshn.enums.Country;
import com.smlsnnshn.enums.Gender;
import com.smlsnnshn.enums.StudentStatus;
import com.smlsnnshn.enums.StudentWorkingStatus;
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
public class StudentDTO {

    private Long studentId;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private boolean enabled;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private Country country;
    private Gender gender;
    private StudentWorkingStatus studentWorkingStatus;
    private StudentStatus studentStatus;
    private GroupDTO group;

}
