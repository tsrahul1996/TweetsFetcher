package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class TwitterControllerTest {

	@Test
	void testGetHomePage() throws IOException {
		TwitterController twitterController = new TwitterController();
		twitterController.getHomePage();
	}

	@Test
	void testFetchTweets() throws IOException {
		TwitterController twitterController = new TwitterController();
		twitterController.fetchTweets(null);

	}

}
