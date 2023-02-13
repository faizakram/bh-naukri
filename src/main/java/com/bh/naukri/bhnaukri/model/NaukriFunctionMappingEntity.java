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
@Table(name = "naukri_function_mappings")
public class NaukriFunctionMappingEntity implements Serializable {

    private static final long serialVersionUID = -3832438507623409675L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "naukri_function_id")
    private String naukriFunctionId;

    @Column(name = "naukri_function_name")
    private String naukriFunctionName;

    @Column(name = "hh_master_functional_area_id")
    private Integer hhMasterFunctionalAreaId;

    @Column(name = "bh_master_function_id")
    private Integer bhMasterFunctionId;

    
}
