package com.iic.app.model;
import jakarta.persistence.CascadeType;
/*
 * Other-Info is the dependent Class.
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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Other_Info_Details")
public class OtherInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Other_Info_Id")
	private Long otherInfoId;
	
	@Column(name = "Specialization")
	private String specialization;
	
	@Column(name = "DateofJoining")
	private String doj;
	
	@Column(name = "EagerToLearn")
	private String learn;
	
	@Column(name = "Date of Leave")
	private String dol;
	
	@Column(name = "Experience")
	private String exp;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="Credential_OtherInfo",joinColumns=@JoinColumn(name="Other_Info_Id",referencedColumnName = "Other_Info_Id"),inverseJoinColumns=@JoinColumn(name = "User_Id", referencedColumnName = "User_Id"))
	private Credentials credentials;

}
