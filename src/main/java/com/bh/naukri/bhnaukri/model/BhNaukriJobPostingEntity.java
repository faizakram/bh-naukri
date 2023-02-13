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

@Entity
@Table(name = "bh_naukri_job_postings")
@Data
@DynamicInsert
@DynamicUpdate
public class BhNaukriJobPostingEntity implements Serializable {

    private static final long serialVersionUID = -3771305869935495612L;
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "bh_job_id")
    private Long bhJobId;

    @Column(name = "naukri_job_id")
    private Long naukriJobId = 0L;

    @Column(name = "message")
    private String message = "";

    @Column(name = "is_deleted")
    private Integer isDeleted = 0;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "created")
    private Date created;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "modified")
    private Date modified;

    //@UserIP(name = DBAction.CREATED)
    @Column(name = "created_by")
    private String createdBy;

    //@UserIP(name = DBAction.MODIFIED)
    @Column(name = "modified_by")
    private String modifiedBy;

    
}
