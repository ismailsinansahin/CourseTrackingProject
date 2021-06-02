package com.smlsnnshn.entity;

import com.smlsnnshn.enums.Country;
import com.smlsnnshn.enums.Gender;
import com.smlsnnshn.enums.MentorWorkingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "mentors")
@Where(clause="is_deleted=false")
public class Mentor extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private boolean enabled;
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    private Country country;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private MentorWorkingStatus mentorWorkingStatus;

    @OneToMany(mappedBy = "mentor")
    private List<Group> group;

}
