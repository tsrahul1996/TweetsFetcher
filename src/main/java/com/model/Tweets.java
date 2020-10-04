package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.json.simple.JSONObject;


public class Tweets {
		
	private List<Tweet> statuses;

	public List<Tweet> getStatuses() {
		return statuses;
	}

	public void setStatuses(List<Tweet> statuses) {
		this.statuses = statuses;
	}

	public Tweets(List<Tweet> statuses) {
		super();
		this.statuses = statuses;
	}

	public Tweets() {
		super();
	}

}
