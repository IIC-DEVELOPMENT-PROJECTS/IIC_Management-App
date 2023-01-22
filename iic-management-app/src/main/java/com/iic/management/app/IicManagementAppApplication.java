package com.iic.management.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iic.management.app.entity.User;
import com.iic.management.app.entity.UserInfo;
import com.iic.management.app.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class IicManagementAppApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(IicManagementAppApplication.class, args);
	}

	@PostConstruct
	public void dump() {
		User arpan = User.builder().username("arpan123").password("123456").userRole("ROLE_ADMIN").build();
		UserInfo arpanInfo = new UserInfo();
		arpanInfo.setUser(arpan);
		arpan.setUserInfo(arpanInfo);
		this.userRepository.save(arpan);
		System.out.println("1 User Saved");
	}

}
