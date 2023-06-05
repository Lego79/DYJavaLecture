package rank;


import rank.service.NormalGameRankService;

public class RankApp {
	
	public static void main(String[] args) {
		

		NormalGameRankService n1 = new NormalGameRankService();
		
		n1.consonantRankCalc();
		n1.wordRankCalc();
		n1.paragraphCalc();
		n1.longParagraphCalc();

	}

}
