package com.bh.naukri.bhnaukri.model;

import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "applications")
@DynamicInsert
@DynamicUpdate
public class AbcBhJobApplicationEntity implements Serializable {

    private static final long serialVersionUID = 6450847449023401261L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "bh_job_id")
    private Integer bhJobId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "master_functional_area_id")
    private Integer masterFunctionalAreaId;

    @Column(name = "master_industry_id")
    private Integer masterIndustryId;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "skills")
    private String skills;

    @Column(name = "designation")
    private String designation;

    @Column(name = "company")
    private String company;

    @Column(name = "experience")
    private Integer experience;

    @Column(name = "educational_qualification")
    private String educationalQualification;

    @Column(name = "desired_location")
    private String desiredLocation;

    @Column(name = "current_location")
    private String currentLocation;

    @Column(name = "caption")
    private String caption;

    @Column(name = "resume_path")
    private String resumePath;

    @Column(name = "resume_content")
    private String resumeContent;

    @Column(name = "status")
    private Integer status;

}
