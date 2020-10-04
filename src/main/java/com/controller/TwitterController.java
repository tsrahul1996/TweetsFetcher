package com.controller;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

import org.apache.commons.codec.binary.Base64;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.delegate.TwitterDelegate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Tweet;
import com.model.Dto.FetchDto;


@Controller

public class TwitterController {

	@Autowired
	TwitterDelegate twitterDelegate;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getHomePage() throws  IOException {
		
		ModelAndView model = new ModelAndView("homePage");
		
		return model;		
	}

	@RequestMapping(value = "/fetchTweets", method = RequestMethod.POST)
	public ModelAndView fetchTweets(@RequestBody FetchDto fetchDto ) throws  IOException {
		List<Tweet>  tweets = twitterDelegate.twitterDelegate(fetchDto);

		for (Tweet tweet : tweets) {
			System.out.println(tweet);
		}
		
		ModelAndView model = new ModelAndView("showTweets");
		model.addObject("tweets", tweets);
		
		return model;		
	}	
}