package ar.edu.unlp.objetos.dos.ejercicio1RedSocial;

import java.util.ArrayList;

import java.util.List;

public class TwitterClon {
	private List<User> users;
	
	public TwitterClon () {
		this.users = new ArrayList<User>();
	}
	public List<User> getUsers(){
		return users;
	}
	public void addUser ( User user) {
		if (user != null) {
			if (!this.userExists(user.getScreenName())) {
				this.users.add(user);
			}
		}
	}

	public boolean userExists(String name) {
		return this.users.stream().anyMatch(user -> user.getScreenName().equals(name));
	}
	private User findUser (String name) {
		return this.users.stream()
				.filter(u -> u.getScreenName().equals(name))
				.findFirst()
				.orElse(null);
	}
	public void deleteUser(String name) {
		User userDelete = this.findUser(name);
		
		if (userDelete != null) {
			this.users.stream()
			.filter(u -> !u.equals(userDelete))
			.forEach(u -> u.deleteTweetReference(userDelete.getList()));
			userDelete.deleteTweets();
			this.users.remove(userDelete);
		}
		
	}
}
