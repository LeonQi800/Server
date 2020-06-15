package com.lioenix.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lioenix.spring.model.HulkUser;

public interface HulkUserRepository extends JpaRepository <HulkUser, Long> {

	HulkUser findById(int id);

}
