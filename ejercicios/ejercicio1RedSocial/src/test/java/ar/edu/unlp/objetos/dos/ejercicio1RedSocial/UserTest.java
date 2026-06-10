package ar.edu.unlp.objetos.dos.ejercicio1RedSocial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class UserTest {
	User user1,user2,user3,user4;
	@BeforeEach
	void setUp() throws Exception {
		user1 = new User("Pepito");
		user1.postTweet(null);
		user1.postTweet("");
		

		user2 = new User("Joseph");
		user2.postTweet("Post!");
		
		user3 = new User("Eugenio");
		user3.postTweet("a".repeat(281));
		user3.doReTweet(null);
		user4 = new User("Haugust");
		user4.doReTweet(user2.getList().getFirst());
	}
	@Test
	public void TestPostTweet() {
		assertEquals(true,user1.getList().isEmpty());
		assertEquals(false,user2.getList().isEmpty());
		assertEquals(true,user3.getList().isEmpty());

	}
	@Test
	public void TestDoReTweet() {
		assertEquals(true,user3.getList().isEmpty());
		assertEquals(false,user4.getList().isEmpty());
	}
	@Test
	public void deleteTweets() {
		user2.deleteTweets();
		assertEquals(true,user2.getList().isEmpty());
	}
	@Test
	public void deleteTweetReference() {
		user4.deleteTweetReference(user2.getList());
		assertEquals(true,user4.getList().isEmpty());
	}
}
