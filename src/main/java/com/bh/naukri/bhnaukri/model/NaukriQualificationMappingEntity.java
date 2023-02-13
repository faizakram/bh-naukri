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
@Table(name = "naukri_qualification_mappings")
public class NaukriQualificationMappingEntity implements Serializable {

    private static final long serialVersionUID = 1050694336798981424L;

    @GeneratedValue
    @Id
    private Integer id;

    @Column(name = "naukri_qualification_id")
    private Integer naukriQualificationId;

    @Column(name = "naukri_qualification_name")
    private String naukriQualificationName;

    @Column(name = "naukri_specialization_id")
    private Integer naukriSpecializationId;

    @Column(name = "naukri_specialization_name")
    private String naukriSpecializationName;

    @Column(name = "qualification_type")
    private String qualificationType;

}
