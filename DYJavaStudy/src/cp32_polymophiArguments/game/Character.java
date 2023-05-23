package cp32_polymophiArguments.game;

public class Character {
	
	private String name;
	private String character;
	
	
	public Character(String name, String character) {		
		this.name = name;
		this.character = character;
	}
	
	public Character(String name) {		
		this.name = name;
		
	}
	
	
	
	public String getName() {
		return name;
	}


	public String getCharacter() {
		return character;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setCharacter(String character) {
		this.character = character;
	}


	public void printInfo() {
		
		System.out.print("이름=" + getName());
		System.out.print(" | " + "캐릭터=" + getCharacter());
	}
	
	public void attack() {
		System.out.println("공격");
	}
	

}
