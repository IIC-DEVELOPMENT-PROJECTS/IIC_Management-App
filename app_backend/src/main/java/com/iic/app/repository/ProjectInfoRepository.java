package com.iic.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iic.app.model.ProjectInfo;

public interface ProjectInfoRepository extends JpaRepository<ProjectInfo, String> {

}
