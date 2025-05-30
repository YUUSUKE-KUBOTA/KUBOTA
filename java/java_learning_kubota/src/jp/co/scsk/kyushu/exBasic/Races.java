package jp.co.scsk.kyushu.exBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Races {
	
	public static void main(String[] args) {
		ArrayList<RacerInfo> racerInfoArray = new ArrayList<>();
		Map<Integer, Map<Integer, RacerInfo>> raceResultMap = new HashMap<>();
		RacerInfo racerInfo1 = new RacerInfo();
		racerInfo1.setName("K");
		racerInfo1.setNumber(2);
		racerInfo1.setRank(1);
		racerInfo1.setTime(8.00);
		racerInfoArray.add(racerInfo1);
		RacerInfo racerInfo2 = new RacerInfo();
		racerInfo2.setName("Y");
		racerInfo2.setNumber(2);
		racerInfo2.setRank(2);
		racerInfo2.setTime(9.30);
		racerInfoArray.add(racerInfo2);
		RacerInfo racerInfo3 = new RacerInfo();
		racerInfo3.setName("A");
		racerInfo3.setNumber(1);
		racerInfo3.setRank(1);
		racerInfo3.setTime(9.30);
		racerInfoArray.add(racerInfo3);
		RacerInfo racerInfo4 = new RacerInfo();
		racerInfo4.setName("P");
		racerInfo4.setNumber(1);
		racerInfo4.setRank(2);
		racerInfo4.setTime(7.30);
		racerInfoArray.add(racerInfo4);
		RacerInfo racerInfo5 = new RacerInfo();
		racerInfo5.setName("APP");
		racerInfo5.setNumber(3);
		racerInfo5.setRank(1);
		racerInfo5.setTime(9.30);
		racerInfoArray.add(racerInfo5);
		raceResultMap = createRaceResult(racerInfoArray);
		Races races = new Races();
		races.sortRaceResult(raceResultMap, 1);
//		for (int raceOrder : raceResultMap.keySet()) {
//			System.out.println("レース順: " + raceOrder);
//			Map<Integer, RacerInfo> rankMap = raceResultMap.get(raceOrder);
//			for (int rank : rankMap.keySet()) {
//				RacerInfo racerInfo = rankMap.get(rank);
//				System.out.println("  順位: " + rank + ", 走者名: " + racerInfo.getName() + ", タイム: " + racerInfo.getTime());
//			}
//		}
		
	}
	
	public static Map<Integer, Map<Integer, RacerInfo>> createRaceResult(ArrayList<RacerInfo> racerInfoArray) {
	    HashMap<Integer, Map<Integer, RacerInfo>> result = new HashMap<>();    
	    for (RacerInfo racerInfo : racerInfoArray) {
			Map<Integer, RacerInfo> onePartResult = result.getOrDefault(racerInfo.getNumber(), new HashMap<>());
			onePartResult.put(racerInfo.getRank(), racerInfo);
			result.put(racerInfo.getNumber(), onePartResult);
		}
		return result;
	}
	
	public void sortRaceResult(Map<Integer, Map<Integer, RacerInfo>> raceResult, int raceNumber) {
	    Map<Integer, RacerInfo> specificRaceResult = raceResult.get(raceNumber);
	    if (specificRaceResult != null) {
	        List<Integer> sortedKeys = new ArrayList<>(specificRaceResult.keySet());
	        Collections.sort(sortedKeys);
	        System.out.println(raceNumber + "レース目");
	        for (Integer key : sortedKeys) {
	            RacerInfo racerInfo = specificRaceResult.get(key);
	            System.out.println(racerInfo.getName());
	        }
	    }
	}
	
	public void bestRacerInfoOfRace(Map<Integer, Map<Integer, RacerInfo>> raceResultMap) {
		Map<Integer, String> firstPlaceNames = new HashMap<>();
		for (Map.Entry<Integer, Map<Integer, RacerInfo>> entry : raceResultMap.entrySet()) {
			Map<Integer, RacerInfo> raceResults = entry.getValue();
			RacerInfo firstPlaceRacer = raceResults.get(1);
			firstPlaceNames.put(entry.getKey(), firstPlaceRacer.getName());
		}
		
	}
}