package com.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.model.UserDetails;

public interface UserDetailsDao extends CrudRepository<UserDetails, Long>{
	
	Optional<UserDetails> findById(Long id);
	UserDetails findByScreenName(String screenName);
	
}
