package com.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "UserDetails")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String screenName;
	private String hashtag;
	private String fetchType;
	
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_FK", referencedColumnName = "id")
    private List<Tweet> listTweets;	
	
	public UserDetails(Long id, String screenName, String hashtag, String fetchType, List<Tweet> listTweets) {
		super();
		this.id = id;
		this.screenName = screenName;
		this.hashtag = hashtag;
		this.fetchType = fetchType;
		this.listTweets = listTweets;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getScreenName() {
		return screenName;
	}


	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}


	public String getHashtag() {
		return hashtag;
	}


	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}


	public String getFetchType() {
		return fetchType;
	}


	public void setFetchType(String fetchType) {
		this.fetchType = fetchType;
	}


	public List<Tweet> getListTweets() {
		return listTweets;
	}


	public void setListTweets(List<Tweet> listTweets) {
		this.listTweets = listTweets;
	}


	public UserDetails() {
		super();
	}


	public UserDetails(String screenName, String hashtag,List<Tweet> listTweets) {
		this.screenName = screenName;
		this.hashtag = hashtag;
		this.listTweets = listTweets;

	} 

	
	
	
}
