# Tweets Fetcher

Tweets fetcher is a open source web application which we can use to fetch real time tweets with specific conditions.

## Getting Started

### Clone

To get started you can simply clone this repository using git:

```
git clone https://github.com/tsrahul1996/twitterDataFetchApp.git
cd twitterDataFetchApp

```


### Prerequisites

Git
JDK 8 or later
Maven 3.0 or later



### Configuration

#### Twitter developer App
Accessing the Twitter APIs requires a set of credentials that you must pass with each request.You have to create a twitter developer account and create new project indorder retrive these credentials. The steps are explained in the following link.

https://developer.twitter.com/en/docs/apps/overview

#### App Configuration

The credentials from your twitter dev account (apiKey and apiKeySecret) are configured in order to get your app working.

tweetFetcher.apiKey = ${your apiKey}

tweetFetcher.apiKeySecret =  ${your apiKeySecret}

The configuration is located in src/resources/application.properties.

With the default configuration you can provide these values through the environment variables apiKey and apiKeySecret.

```
tweetFetcher.apiKey = yourapiKey
tweetFetcher.apiKeySecret = yourapiKeySecret
```

## Deployment


### Build an executable JAR
You can run the application from the command line using maven commands.

mvn clean install : To build executable JAR

The  executable JAR can be found in target folder can be used to deploy in servers.

### Server Configuration

The Default sever configured for this project is Apache tomcat. If you want to re configure it to any other server change pom.xml file server configuration accordingly.

## Test you Application

open http://localhost:8090/home

To fetch all the tweets from Twitter following condition are provided
conditions:
1. By followers (eg: @twitter_handle)
2. By keyword/track (eg: #India, Sports, #Formula1 etc)
3. Both (followers or keywords).

By choosing the above condition using drop down provided and value in given textbox, On a simple click on search button can retrive the tweets.

## Authors

* **Rahul TS** 

## Acknowledgments

* StackOverFlow
* GitHub
