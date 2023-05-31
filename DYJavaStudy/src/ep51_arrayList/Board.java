package ep51_arrayList;

import java.io.Serializable;
import java.util.UUID;

public class Board implements Serializable{
	
	private String subject;
	private String content;
	private String writer;
	private UUID write;
	
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}


	public String getSubject() {
		return subject;
	}


	public String getContent() {
		return content;
	}


	public String getWriter() {
		return writer;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
	
	

}
