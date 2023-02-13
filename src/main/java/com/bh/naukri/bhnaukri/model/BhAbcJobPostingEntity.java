package com.bh.naukri.bhnaukri.model;

import java.util.Date;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;


@Entity
@Table(name = "jobs" )
@Data
@DynamicInsert
@DynamicUpdate
public class BhAbcJobPostingEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "bullhorn_job_id")
    private long bhJobId = 0L;

    @Column(name = "title")
    private String title;

    @Column(name = "job_location")
    private String jobLocation;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_company")
    private String clientCompany;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "posted_on_date")
    private Date postedOnDate;

    @Column(name = "status")
    private int status = 0;

    @Column(name = "job_description")
    private String jobDescription;

    @Column(name = "public_description")
    private String publicDescription;

    @Column(name = "experience")
    private int experience = 0;

    @Column(name = "educational_qualification")
    private String educationalQualification;

    @Column(name = "salary")
    private int salary = 0;

    @Column(name = "skills")
    private String skills;

    @Column(name = "master_functional_area_id")
    private Integer masterFunctionalAreaId;

    @Column(name = "master_industry_id")
    private Integer masterIndustryId;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "modified")
    private Date modified;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "created")
    private Date created;

    
}
