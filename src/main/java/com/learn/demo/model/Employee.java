package com.learn.demo.model;

import com.learn.demo.repository.entity.CIN;
import com.learn.demo.repository.entity.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    private Long id;
    private String matricule;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String image;
    private String address;
    private List<PhoneNumber> phones;
    private Employee.Sex sex;
    private String emailPro;
    private String emailPerso;
    private LocalDate CINIssueDate;
    private String CINNumber;
    private String CINDelivranceLocation;
    private Integer children;
    private String function;
    private LocalDate hiringDate;
    private LocalDate departureDate;
    private String cnapsNumber;
    private Employee.CSP socioProCategory;


    public enum Sex {
        H, F
    }

    public enum CSP {
        M1, M2, OS1, OS2, OS3, OP1, OP2, OP3
    }
}
