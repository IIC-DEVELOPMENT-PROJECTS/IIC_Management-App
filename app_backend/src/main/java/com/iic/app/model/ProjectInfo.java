package com.iic.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Project_Information")
public class ProjectInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Project_Id")
	private Long projId;
	@Column(name = "ProjectName")
	private String projName;
	@Column(name = "ProjectDescription")
	private String projDesc;
	@Column(name = "CreationDate")
	private String creationDate;
	@Column(name = "PreferredDueDate")
	private String prefDueDate;
	@Column(name = "CompletionDate")
	private String completionDate;
	
//	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "projInfo")
//	private List<Credentials> credList=new ArrayList<>();

}
