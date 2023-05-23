package cp32_polymophiArguments.game;

public class Game {
	
	public void attack(Character character) {
		
		if(character instanceof Archer) {
			character.attack();
		} else if(character instanceof Knight) {
			character.attack();
		} else if(character instanceof Wizard) {
			character.attack();
		}
		
		
		
	}

}

