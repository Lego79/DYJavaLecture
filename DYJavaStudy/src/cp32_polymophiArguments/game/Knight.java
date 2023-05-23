package cp32_polymophiArguments.game;

public class Knight extends Character {
	
	public Knight(String name) {
		
		super(name, "Knight");
		
		
	}
	
	
	public void printInfo() {
		
		System.out.print("\n이름=" + getName());
		System.out.print(" | " + "캐릭터=" + getCharacter() );
		
	}
	
	public void attack() {
		
		System.out.println("[" + getName() + " / " + getCharacter() + "]" + "근거리공격");
		
	}

}


