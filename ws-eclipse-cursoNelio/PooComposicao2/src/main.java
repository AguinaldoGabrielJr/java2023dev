import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Comment c3 = new Comment("IRRAAAAAAAAAAA!");
		
		Post post1 = new Post(sdf.parse("21/06/2018 12:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!",12);
		post1.addComment(c1);
		post1.addComment(c2);
		post1.addComment(c3);
		
		Comment c4 = new Comment("Good night");
		Comment c5 = new Comment("May the Force be with you");
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow!",5);
		post2.addComment(c4);
		post2.addComment(c5);
		
		
		System.out.println(post1);
		System.out.println(post2);
	}
	}


