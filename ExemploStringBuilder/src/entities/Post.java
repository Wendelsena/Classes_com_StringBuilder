package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // static para ter apenas uma copia.
	
	private Date moment;
	private String title;
	private String comment;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date moment, String title, String comment, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.comment = comment;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComments() {
		return comment;
	}

	public void setComments(String comment) {
		this.comment = comment;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComment() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(); // sb vai permitir concatenar outros strings usando a funcao append
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(comment + "\n");
		sb.append("\nComments: \n");
		
		// para mostrar todos os comentarios.
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		System.out.println("-------------------------------------------------------");
		return sb.toString();
	}
	
	
}
