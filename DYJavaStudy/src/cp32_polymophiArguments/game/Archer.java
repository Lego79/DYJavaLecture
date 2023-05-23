package cp32_polymophiArguments.game;

public class Archer extends Character {
	
	public Archer(String name) {
		
		super(name,"Archer");
		
		
	}
	
	
	public void printInfo() {
		
		System.out.print("\n이름=" + getName());
		System.out.print(" | " + "캐릭터=" + getCharacter());
		
	}
	
	public void attack() {
		
		System.out.println("[" + getName() + " / " + getCharacter() + "]" + "원거리공격");
		
	}

}
