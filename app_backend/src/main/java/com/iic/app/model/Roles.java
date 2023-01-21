package com.iic.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RoleId")
	private int roleId;
	@Column(name = "UserRoles")
	private String userRole;
	@Column(name = "RoleDescription")
	private String roleDesc;
}
