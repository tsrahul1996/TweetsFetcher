package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.TweetDetails;
 
public interface TweetDetailsDao extends CrudRepository<TweetDetails, Long>{

	TweetDetails findById(String primaryEmail);
	
}
	
