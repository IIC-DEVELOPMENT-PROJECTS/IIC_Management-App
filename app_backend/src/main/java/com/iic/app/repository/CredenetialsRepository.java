package com.iic.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iic.app.model.Credentials;

public interface CredenetialsRepository extends JpaRepository<Credentials, String> {

}
