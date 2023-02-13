package com.bh.naukri.bhnaukri.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * Created by richa on 1/9/16.
 */
@Entity
@Table(name = "bh_candidate_data")
public class BhCandidateDataEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "bh_candidate_id")
    private Integer bhCandidateId;

    @Column(name = "function_id")
    private Integer functionId;

    @Column(name = "industry_id")
    private Integer industryId;

    @Column(name = "description")
    private String description;

    @Column(name = "is_deleted")
    private Integer isDeleted = 0;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "created")
    private Date created;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "modified")
    private Date modified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBhCandidateId() {
        return bhCandidateId;
    }

    public void setBhCandidateId(Integer bhCandidateId) {
        this.bhCandidateId = bhCandidateId;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "BhCandidateDataEntity{" +
                "id=" + id +
                ", bhCandidateId=" + bhCandidateId +
                ", functionId=" + functionId +
                ", industryId=" + industryId +
                ", description='" + description + '\'' +
                ", isDeleted=" + isDeleted +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}
