package com.service;

import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.model.Tweet;
import com.model.Tweets;
import com.model.Dto.FetchDto;

@Service
public interface TwitterService {
	List<Tweet> fetchFollowersTweets(FetchDto fetchDto) ;
	List<Tweet> fetchTweets(FetchDto fetchDto);
	List<Tweet> fetchHashTagTweets(FetchDto fetchDto);
}
