package com.iic.management.app.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "app_user")
public class User {

	@Id
	@GenericGenerator(name = "user_id_generator", strategy = "com.iic.management.app.generator.UserIdGenerator")
	@GeneratedValue(generator = "user_id_generator")
	@Column(name = "user_id")
	private String userId;

	private String username;

	private String password;

	@Column(name = "user_role")
	private String userRole;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_info_id", referencedColumnName = "user_info_id")
	private UserInfo userInfo;

}
