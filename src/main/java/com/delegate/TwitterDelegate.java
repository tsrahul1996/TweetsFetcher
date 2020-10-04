package com.delegate;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Tweet;
import com.model.Tweets;
import com.model.Dto.FetchDto;
import com.service.TwitterService;

@Component
public class TwitterDelegate {

	@Autowired
	TwitterService  twitterService;

	public  List<Tweet> twitterDelegate(FetchDto fetchDto) {
		 List<Tweet> tweets = new ArrayList<Tweet>();

		if(fetchDto.getFetchType().trim().equals("F")) {
			tweets = twitterService.fetchFollowersTweets(fetchDto);		
		}else if(fetchDto.getFetchType().trim().equals("H")) {
			tweets = twitterService.fetchHashTagTweets(fetchDto);	
		}else if (fetchDto.getFetchType().trim().equals("B")){
			tweets = twitterService.fetchTweets(fetchDto);
		}
		return  tweets;
	}
}
