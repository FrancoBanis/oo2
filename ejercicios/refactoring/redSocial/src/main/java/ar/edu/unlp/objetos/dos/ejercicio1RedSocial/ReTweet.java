package ar.edu.unlp.objetos.dos.ejercicio1RedSocial;

public class ReTweet extends Tweet {
	private Tweet from;
	
	public ReTweet(Tweet from) {
		super(from.getText());
		this.from = from;
	}

	public boolean isThisRetweet(Tweet tweet) {
		return from == tweet;
	}
}
	