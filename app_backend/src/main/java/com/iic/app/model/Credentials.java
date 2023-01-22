package com.iic.app.model;
import jakarta.persistence.CascadeType;
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
@Table(name="User_Credentials")
public class Credentials {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "User_Id")
	private Long userId;
	
	//@NotNull(message = "Password shouldn't be null")
	//@Pattern(regexp = "((?=.*[@!#$%])(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,30})", message = "Should be 8 to 30 characters and must contain 1 uppercase, lowercase, number and special character")
	@Column(name = "password")
	private String password;
	
	@Column(name = "UserRole")
	private String userRole;
	
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy ="credentials", fetch = FetchType.LAZY)
	@JoinTable(name="Credential_Personal",joinColumns=@JoinColumn(name="User_Id",referencedColumnName = "User_Id"),inverseJoinColumns=@JoinColumn(name = "Personal_Info_Id", referencedColumnName = "Personal_Info_Id"))
	private PersonalInfo info;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy ="credentials", fetch = FetchType.LAZY)
	@JoinTable(name="Credential_OtherInfo",joinColumns=@JoinColumn(name="User_Id",referencedColumnName = "User_Id"),inverseJoinColumns=@JoinColumn(name = "Other_Info_Id", referencedColumnName = "Other_Info_Id"))
	private OtherInfo otinfo;
	
//	@ManyToMany(cascade = CascadeType.ALL )
//	@JoinTable(name="Cred_Projects", joinColumns = {@JoinColumn(name="Project_Id")}, inverseJoinColumns = {@JoinColumn(name ="User_Id" )})
//	private List<ProjectInfo> projInfo=new ArrayList<>();
	

}
