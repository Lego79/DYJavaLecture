package cp32_polymophiArguments.game;

public class Wizard extends Character {
	
	public Wizard(String name) {
		
		super(name,"Wizard");		
		
	}
	
	
	public void printInfo() {
		
		System.out.print("\n이름=" + getName());
		System.out.print(" | " + "캐릭터=" + getCharacter() );
		
	}
	
	public void attack() {
		
		System.out.println("[" + getName() + " / " +  getCharacter()+ "]" + " 마법 공격");
		
	}

}
