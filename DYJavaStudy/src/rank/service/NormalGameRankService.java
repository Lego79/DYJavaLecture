package rank.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import rank.entity.LastwordRank;
import rank.entity.NormalGameRank;

public class NormalGameRankService {

	
    private List<NormalGameRank> consonantRankList;
    private List<NormalGameRank> wordRankList;
    private List<NormalGameRank> paragraphRankList;
    private List<NormalGameRank> longParagraphRankList;




	
    public NormalGameRankService() {
        this.consonantRankList = new ArrayList<>();
        this.wordRankList = new ArrayList<>();
        this.paragraphRankList = new ArrayList<>();
        this.longParagraphRankList = new ArrayList<>();
    }
	
	
	

	


	private static final String CONSONANT_PATH = "C:\\Temp/rank/consonantRank.txt";
	private static final String WORD_PATH = "C:\\Temp/rank/wordRank.txt";
	private static final String PARAGRAPH_PATH = "C:\\Temp/rank/paragraphRank.txt";
	private static final String LONG_PARAGRAPH_PATH = "C:\\Temp/rank/longParagraphRank.txt";

	
	
	public void consonantRankCalc() {
		try {
			File file = new File(CONSONANT_PATH);
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split("/");

				if (parts.length == 3) {
					String user = parts[0];
					String category = parts[1];
					int clearTime = Integer.parseInt(parts[2]);
					consonantRankList.add(new NormalGameRank(user, category, clearTime));
				}
			}
			scanner.close();
			
			Collections.sort(consonantRankList,
					(rank1, rank2) -> Integer.compare(rank1.getClearTime(), rank2.getClearTime()));

			int cnt = 0;	
			for(int i = 0; i < 6; i++) {				
			
				
				System.out.println("\n자리 연습 " + (cnt + 1) + "등: " + consonantRankList.get(i).getUser());
				System.out.println("걸린시간: " + consonantRankList.get(i).getClearTime() + "초");
				cnt++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getStackTrace());
		} catch(IndexOutOfBoundsException e) {
			System.out.println("\n랭킹은 5등까지만 산출합니다. 유저가 6명 이하면 등록된 유저까지만 출력합니다");
		}
	}
	
	
	public void wordRankCalc() {
		try {
			File file = new File(WORD_PATH);
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split("/");

				if (parts.length == 3) {
					String user = parts[0];
					String category = parts[1];
					int clearTime = Integer.parseInt(parts[2]);
					wordRankList.add(new NormalGameRank(user, category, clearTime));
				}
			}
			scanner.close();
			
			Collections.sort(wordRankList,
					(rank1, rank2) -> Integer.compare(rank1.getClearTime(), rank2.getClearTime()));
			
				
			int cnt = 0;			
			for(int i = 0; i < 6; i++) {				
	
				
				System.out.println("\n자리 연습 " + (cnt + 1) + "등: " + wordRankList.get(i).getUser());
				System.out.println("걸린시간: " + wordRankList.get(i).getClearTime() + "초");
				cnt++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getStackTrace());
		} catch(IndexOutOfBoundsException e) {
			System.out.println("\n랭킹은 5등까지만 산출합니다. 유저가 6명 이하면 등록된 유저까지만 출력합니다");
		}
	}
	
	public void paragraphCalc() {
		try {
			File file = new File(PARAGRAPH_PATH);
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split("/");

				if (parts.length == 3) {
					String user = parts[0];
					String category = parts[1];
					int clearTime = Integer.parseInt(parts[2]);
					paragraphRankList.add(new NormalGameRank(user, category, clearTime));
				}
			}
			scanner.close();
			
			Collections.sort(paragraphRankList,
					(rank1, rank2) -> Integer.compare(rank1.getClearTime(), rank2.getClearTime()));
			
				
			int cnt = 0;			
			for(int i = 0; i < 6; i++) {				
	
				
				System.out.println("\n자리 연습 " + (cnt + 1) + "등: " + paragraphRankList.get(i).getUser());
				System.out.println("걸린시간: " + paragraphRankList.get(i).getClearTime() + "초");
				cnt++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getStackTrace());
		} catch(IndexOutOfBoundsException e) {
			System.out.println("\n랭킹은 5등까지만 산출합니다. 유저가 6명 이하면 등록된 유저까지만 출력합니다");
		}
	}
	
	public void longParagraphCalc() {
		try {
			File file = new File(LONG_PARAGRAPH_PATH);
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split("/");

				if (parts.length == 3) {
					String user = parts[0];
					String category = parts[1];
					int clearTime = Integer.parseInt(parts[2]);
					longParagraphRankList.add(new NormalGameRank(user, category, clearTime));
				}
			}
			scanner.close();
			
			Collections.sort(longParagraphRankList,
					(rank1, rank2) -> Integer.compare(rank1.getClearTime(), rank2.getClearTime()));
			
				
			int cnt = 0;			
			for(int i = 0; i < 6; i++) {				
	
				
				System.out.println("\n자리 연습 " + (cnt + 1) + "등: " + longParagraphRankList.get(i).getUser());
				System.out.println("걸린시간: " + longParagraphRankList.get(i).getClearTime() + "초");
				cnt++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getStackTrace());
		} catch(IndexOutOfBoundsException e) {
			System.out.println("\n랭킹은 5등까지만 산출합니다. 유저가 6명 이하면 등록된 유저까지만 출력합니다");
		}
	}
	

}
