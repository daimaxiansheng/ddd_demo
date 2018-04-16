package com.adu21.ddd.quotation.domain.model;

import com.adu21.ddd.model.Gender;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class CarPolicyQuotation extends Quotation {
    private String productiveYear;
    private String carBrand;
    private String carModel;
    private String parkPlace;
    private String distancePreYear;
    private LocalDate driverBirthDay;
    @Enumerated(EnumType.STRING)
    private Gender driverGender;
}