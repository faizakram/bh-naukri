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
@Table(name = "naukri_city_mappings")
public class NaukriCityMappingEntity implements Serializable {

    private static final long serialVersionUID = 9212910395744704484L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "naukri_city_id")
    private String naukriCityId;

    @Column(name = "naukri_city_name")
    private String naukriCityName;

    @Column(name = "hh_master_city_id")
    private Integer hhMasterCityId;

    
}
