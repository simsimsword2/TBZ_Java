import java.time.LocalDate;

public class Starter {

	/**
	 * In the main we set up the whole structure.
	 * Not the best approach, but okay to demonstrate that the structure works.
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		NewsFeed news = new NewsFeed();
		
		MessagePost post1 = new MessagePost("john", "Had a great day up in Zermatt!");
		post1.like();
		post1.like();

		EventPost post2 = new EventPost("ueli", "Call homeschooling", LocalDate.parse("2021-03-21"));
		post2.like();
		post2.unlike();
		post2.addComments("salli hoi");
		post2.like();

		PhotoPost post3 = new PhotoPost("flo", "cool_flo.gif", "hihihi");
		post3.like();
		post3.like();
		post3.like();
		post3.like();
		post3.like();
		post3.like();
		post3.like();

		news.addPost(post1);
		news.addPost(post2);
		news.addPost(post3);
		news.show();

	}

}
