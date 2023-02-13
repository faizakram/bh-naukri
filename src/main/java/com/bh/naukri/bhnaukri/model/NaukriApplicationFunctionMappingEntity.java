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
@Table(name = "naukri_application_function_mappings")
public class NaukriApplicationFunctionMappingEntity implements Serializable {

    private static final long serialVersionUID = -8442030743869882834L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "naukri_application_function_id")
    private Integer naukriApplicationFunctionId;

    @Column(name = "naukri_application_function_name")
    private String naukriApplicationFunctionName;

    @Column(name = "bh_master_function_id")
    private Integer bhMasterFunctionId;

    
}
