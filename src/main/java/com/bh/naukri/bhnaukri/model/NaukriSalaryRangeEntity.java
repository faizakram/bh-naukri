package com.bh.naukri.bhnaukri.model;

import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "naukri_salary_range_mappings")
public class NaukriSalaryRangeEntity implements Serializable {

    private static final long serialVersionUID = 3480529258343319527L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "minimum_salary")
    private Integer minimumSalary;

    @Column(name = "maximum_salary")
    private Integer maximumSalary;

    
}
