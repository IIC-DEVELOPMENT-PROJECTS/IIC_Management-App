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
@Table(name = "ProjectInformation")
public class ProjectInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ProjectId")
	private String projId;
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

}
