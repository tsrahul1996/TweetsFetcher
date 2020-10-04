package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TweetDetails")
public class Tweet {
	
	@Id
    private String id;
    private String text;
    
	public Tweet() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Tweet(String id, String text) {
		super();
		this.id = id;
		this.text = text;
	}




}
