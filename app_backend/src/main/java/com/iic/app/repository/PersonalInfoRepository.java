package com.iic.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iic.app.model.PersonalInfo;

public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, Long> {

}
