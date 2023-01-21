package com.iic.app.model;
/*
 * Credential is the source Class.
 * One to One(Bi-directional) Mapping done with Personal-Info
 * One to One(Bi-directional) Mapping done with Other-Info
 * Done by Arpan Ghosh
 */
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="UserCredentials")
public class Credentials {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	private String userId;
	@NotNull(message = "Password shouldn't be null")
	@Pattern(regexp = "((?=.*[@!#$%])(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,30})", message = "Should be 8 to 30 characters and must contain 1 uppercase, lowercase, number and special character")
	@Column(name = "password")
	private String password;
	@Column(name = "UserRole")
	private String userRole;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "credentials", fetch = FetchType.LAZY)
	@JoinColumn(name = "PiId", referencedColumnName = "personalInfoId")
	private PersonalInfo info;
	
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "credentials", fetch = FetchType.LAZY)
//	@JoinColumn(name = "OtId", referencedColumnName = "OtherInfoId")
//	private OtherInfo otinfo;
	
//	@ManyToMany(cascade = CascadeType.ALL )
//	@JoinTable(name="Cred_Projects", joinColumns = {@JoinColumn(name="Project_Id")}, inverseJoinColumns = {@JoinColumn(name ="User_Id" )})
//	private List<ProjectInfo> projInfo=new ArrayList<>();
	

}
