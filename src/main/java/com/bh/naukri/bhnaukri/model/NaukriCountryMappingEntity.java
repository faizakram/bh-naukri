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
@Table(name = "naukri_country_mappings")
public class NaukriCountryMappingEntity implements Serializable {

    private static final long serialVersionUID = -2584590326319601282L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "naukri_country_id")
    private String naukriCountryId;

    @Column(name = "naukri_country_name")
    private String naukriCountryName;

    @Column(name = "hh_master_country_id")
    private Integer hhMasterCountryId;

    
}
