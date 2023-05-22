package ep15_staticFinal;

public class Earth {
	
	static final double EARTH_RADIUS = 6400; //선언과 초기화를 동시에
	static final double EARTH_SURFACE_AREA; // 상수 선언
	
	static {
		
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		
	}
	

}
