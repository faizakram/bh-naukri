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
@Table(name = "master_functional_areas")
public class FunctionalAreaEntity implements Serializable {

	private static final long serialVersionUID = 6289920425474557393L;

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "category")
	private String category;

	@Column(name = "group_name")
	private String groupName;

	@Column(name = "naukri_function_id")
	private String naukriFunctionId;

	@Column(name = "naukri_function")
	private String naukriFunction;

	@Column(name = "is_deleted")
	private Integer isDeleted = 0;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "created")
	private Date createdDate;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "modified")
	private Date modifiedDate;

	//@UserIP(name = DBAction.CREATED)
	@Column(name = "created_by")
	private String createdBy;

	//@UserIP(name = DBAction.MODIFIED)
	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "camelized_name")
	private String camelizedName;

	
}
