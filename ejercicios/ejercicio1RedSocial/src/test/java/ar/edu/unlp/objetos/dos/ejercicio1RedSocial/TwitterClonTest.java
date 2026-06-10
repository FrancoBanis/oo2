package ar.edu.unlp.objetos.dos.ejercicio1RedSocial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterClonTest {
	TwitterClon twittus,twittering;
	User pepitoTwittero , joseMartin;
	@BeforeEach
	void setUp() throws Exception {
		
		twittus = new TwitterClon();
		twittus.addUser(null);
		
		User pepitoTwittero = new User("Pepitox");
		twittering = new TwitterClon();
		twittering.addUser(pepitoTwittero);
		User joseMartin = new User("NoSoyJose");
		twittering.addUser(joseMartin);
		twittering.deleteUser("NoSoyJose");
		twittering.deleteUser(null);
	}
	@Test
	public void TestAddUser() {
		assertEquals(true,twittus.getUsers().isEmpty());
		assertEquals(false,twittering.getUsers().isEmpty());
	}
	@Test
	public void TestDeleteUser() {
		assertEquals(false,
				twittering.getUsers()
				.contains(joseMartin));
	}
}
