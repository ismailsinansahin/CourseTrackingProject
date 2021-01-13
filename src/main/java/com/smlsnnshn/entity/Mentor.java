package com.smlsnnshn.entity;

import com.smlsnnshn.enums.Country;
import com.smlsnnshn.enums.Gender;
import com.smlsnnshn.enums.MentorWorkingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "mentors")
public class Mentor extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private boolean enabled;

    @Enumerated(EnumType.STRING)
    private Country country;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private MentorWorkingStatus mentorWorkingStatus;

}
