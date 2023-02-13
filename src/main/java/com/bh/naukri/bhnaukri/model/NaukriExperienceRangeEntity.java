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
@Table(name = "naukri_experience_range_mappings")
public class NaukriExperienceRangeEntity implements Serializable {

    private static final long serialVersionUID = -6355196863957682344L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "naukri_minimum_experience")
    private Integer naukriMinimumExperience;

    @Column(name = "naukri_allowed_maximum_experience")
    private Integer naukriAllowedMaximumExperience;

    @Column(name = "minimum_experience")
    private Integer minimumExperience;

    @Column(name = "maximum_experience")
    private Integer maximumExperience;

}
