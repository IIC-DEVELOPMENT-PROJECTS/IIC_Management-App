package com.iic.app.model;
/*
 * Personal-Info is the dependent Class.
 * One to One(Bi-directional) Mapping done with Credential
 * Done by Arpan Ghosh
 */
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class PersonalInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "personalInfoId")
	private String personalInfoId;
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
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CredId", referencedColumnName = "userId")
	private Credentials credentials;

}
