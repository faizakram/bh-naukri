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
@Table(name = "naukri_function_role_mappings")
public class NaukriFunctionRoleMappingEntity implements Serializable {

    private static final long serialVersionUID = -8750034938307830057L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "naukri_function_id")
    private String naukriFunctionId;

    @Column(name = "naukri_function_name")
    private String naukriFunctionName;

    @Column(name = "naukri_role_id")
    private String naukriRoleId;

    @Column(name = "naukri_role_name")
    private String naukriRoleName;

    @Column(name = "bh_naukri_role_name")
    private String bhNaukriRoleName;

}
