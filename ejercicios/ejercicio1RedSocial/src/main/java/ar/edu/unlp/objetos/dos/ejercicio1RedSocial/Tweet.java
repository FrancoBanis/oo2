package ar.edu.unlp.objetos.dos.ejercicio1RedSocial;

public class Tweet {
	protected  String text;
	
	public Tweet(String text) {
		this.text = text;
		} 

	public String getText() {
		return this.text;
	}
	public boolean isValidText (String text) {
		return (text.length() >= 1 && text.length() <= 280);
	}
	public boolean isThisRetweet(Tweet tweet) {
		return false;
	}
	
}
