package com.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.model.TokenDetails;

@Service
public class TokenUtils {	
	
	@Value("${tweetFetcher.apiKey}")
	private String apiKey;
	
	@Value("${tweetFetcher.apiKeySecret}")
	private String apiKeySecret;

	
	public TokenDetails  generateToken() throws URISyntaxException {
	

		String credentials = apiKey+":"+apiKeySecret;
		String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));

		
		RestTemplate restTemplate = new RestTemplate();
	
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("Authorization", "Basic "+ encodedCredentials);
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
					
		Map<String, String> params = new HashMap<String, String>();
		params.put("grant_type", "client_credentials");
				
		String url = "https://api.twitter.com/oauth2/token";
				
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("grant_type","client_credentials");
	
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, headers);
	
		ResponseEntity<TokenDetails> response =
		    restTemplate.exchange(url,
		                          HttpMethod.POST,
		                          entity,
		                          TokenDetails.class);
		
		return response.getBody();
	}
}
