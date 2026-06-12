package ar.edu.unlp.objetos.dos.ejercicio1RedSocial;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String screenName ;
	private List<Tweet> tweets;
	
	
	public User ( String screenName) {
		this.screenName =  screenName;
		this.tweets = new ArrayList<Tweet>();
	}
	public void postTweet (String text) {
		if (text != null) {
			Tweet nuevoTweet = new Tweet(text);
			if (nuevoTweet.isValidText(text) != false) {
				this.tweets.add(nuevoTweet);
			}
		}
	}
	public List<Tweet> getList (){
		return tweets;
	}
	public void doReTweet (Tweet originalTweet) {
		if (originalTweet != null){
			ReTweet retweet = new ReTweet(originalTweet);
			this.tweets.add(retweet);
		}
	}
	public String getScreenName() {
		return this.screenName;
	}

	public void deleteTweets () {
		this.tweets.clear();
	}
	public void deleteTweetReference(List<Tweet> twtRemove) {
		twtRemove.forEach(t -> this.tweets.removeIf(twt -> twt.isThisRetweet(t)));
	}
}
