package com.bh.naukri.bhnaukri.model;

import java.io.Serializable;
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

@Data
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "naukri_candidate_application_responses")
public class NaukriCandidateApplicationResponseEntity implements Serializable {

    private static final long serialVersionUID = 3656453210729474150L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "naukri_response")
    private String naukriResponse;

    @Column(name = "processed")
    private Integer processed = 0;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "created")
    private Date created;

}
