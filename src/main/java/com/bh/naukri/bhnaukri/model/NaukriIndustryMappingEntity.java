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
@Table(name = "naukri_industry_mappings")
public class NaukriIndustryMappingEntity implements Serializable {

    private static final long serialVersionUID = -4919822989884751723L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "naukri_industry_id")
    private Integer naukriIndustryId;

    @Column(name = "naukri_industry_name")
    private String naukriIndustryName;

    @Column(name = "hh_master_industry_id")
    private Integer hhMasterIndustryId;

    @Column(name = "bh_master_industry_id")
    private Integer bhMasterIndustryId;

   
}
