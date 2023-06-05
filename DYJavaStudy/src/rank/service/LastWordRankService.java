package rank.service;

import java.util.ArrayList;
import java.util.List;

import rank.entity.LastwordRank;

public class LastWordRankService  {
	
	private List<LastwordRank> lastWordRankList;

	public LastWordRankService(List<LastwordRank> lastWordRankList) {
	
		this.lastWordRankList = lastWordRankList;
	}
	
	public LastWordRankService() {
		
		this.lastWordRankList = new ArrayList<>();
	}
	
	

}
