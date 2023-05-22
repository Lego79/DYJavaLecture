package ep20_polymophism.gun;

public class GunApp {
	
	public static void main(String[] args) {
	
	Soldier s1 = new Soldier();
	
	s1.gun = new Gun();
	s1.shotting();
	
	s1.gun = new ShotGun();
	s1.shotting();
	
	s1.gun = new MachineGun();
	s1.shotting();
	
	}

}
