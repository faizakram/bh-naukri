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
@Table(name = "naukri_application_industry_mappings")
public class NaukriApplicationIndustryMappingEntity implements Serializable {

    private static final long serialVersionUID = 5460314503669425578L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "naukri_application_industry_id")
    private Integer naukriApplicationIndustryId;

    @Column(name = "naukri_application_industry_name")
    private String naukriApplicationIndustryName;

    @Column(name = "bh_master_industry_id")
    private Integer bhMasterIndustryId;

}
