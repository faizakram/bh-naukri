package com.bh.naukri.bhnaukri.model;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "bh_clients")
@Data
@DynamicInsert
@DynamicUpdate
public class BhClientEntity implements Serializable{

	/**
	 * @author amitn
	 */
	private static final long serialVersionUID = 6286564962823849567L;

	@Id
	@Column(name = "bh_id")
	private Integer bhId;

	@Column(name = "emailid")
	private String emailid;

	@Column(name = "enabled")
	private Integer enabled = 1;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	
}
