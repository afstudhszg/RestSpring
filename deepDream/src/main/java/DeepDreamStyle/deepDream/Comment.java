package DeepDreamStyle.deepDream;

import java.util.Date;

public class Comment {

	private String author;
	private String comment;
	private Date commentDate;
	
	public Comment(String autor, String commentContent) {
		author = autor;
		comment = commentContent;
		commentDate = new Date();
		
		//Blabla
	}
}
