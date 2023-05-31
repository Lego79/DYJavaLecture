package ep62_objectStream;

import java.io.Serializable;

public class Member implements Serializable {

	private static final long serialVersionUID = -9107751934041855363L;
	private String id;
	private String name;
	
	
	public Member(String id, String name) {

		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
		}
	

}
