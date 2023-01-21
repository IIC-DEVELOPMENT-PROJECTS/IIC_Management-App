package com.iic.app.model;
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OtherInfoDetails")
public class OtherInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OtherInfoId")
	private String otherInfoId;
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
	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="CredId", referencedColumnName = "UserId")
//	private Credentials credentials;

}
