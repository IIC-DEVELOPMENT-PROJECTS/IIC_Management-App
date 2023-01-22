package com.iic.app.model;
import jakarta.persistence.CascadeType;
/*
 * Personal-Info is the dependent Class.
 * One to One(Bi-directional) Mapping done with Credential
 * Done by Arpan Ghosh
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Personal_Info")
public class PersonalInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Personal_Info_Id")
	private Long personalInfoId;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "PhoneNo")
	private String phnNo;
	
	@Column(name = "EnrollmentId")
	private String enrollId;
	
	//One to One Mapping with Credentials
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name="Credential_Personal",joinColumns=@JoinColumn(name="Personal_Info_Id",referencedColumnName = "Personal_Info_Id"),inverseJoinColumns=@JoinColumn(name = "User_Id", referencedColumnName = "User_Id"))
	private Credentials credentials;

}
