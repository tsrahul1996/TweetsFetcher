package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TweetDetails")
public class TweetDetails {
	
	@Id
    private Long id;
    private String tweetId;
    private String text;
     
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTweetId() {
		return tweetId;
	}

	public void setTweetId(String tweetId) {
		this.tweetId = tweetId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TweetDetails(Long id, String tweetId, String text) {
		super();
		this.id = id;
		this.tweetId = tweetId;
		this.text = text;
	}

	public TweetDetails() {
		super();
	} 

	
}
