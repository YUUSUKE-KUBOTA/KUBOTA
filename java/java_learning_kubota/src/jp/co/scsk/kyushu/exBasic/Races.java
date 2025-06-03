package jp.co.scsk.kyushu.exBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

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
		racerInfo2.setTime(10.30);
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
		racerInfo4.setRank(4);
		racerInfo4.setTime(7.30);
		racerInfoArray.add(racerInfo4);
		RacerInfo racerInfo5 = new RacerInfo();
		racerInfo5.setName("APP");
		racerInfo5.setNumber(3);
		racerInfo5.setRank(4);
		racerInfo5.setTime(9.30);
		racerInfoArray.add(racerInfo5);
		raceResultMap = createRaceResult(racerInfoArray);
		Races races = new Races();
//		races.sortRaceResult(raceResultMap, 1);
//		races.bestRacerInfoOfRace(raceResultMap);
//		races.bestRacerInfoOfAll(raceResultMap);
//		races.worstRacerInfoOfAll(raceResultMap);
		races.winnerRacerInfo(raceResultMap);
//		races.top10RacerInfo(raceResultMap);
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
		List<RacerInfo> firstRankList = new ArrayList<>();
		for (Map<Integer, RacerInfo> innerMap : raceResultMap.values()) {
			RacerInfo firstRankRacer = innerMap.get(1);
			if (firstRankRacer != null) {
				firstRankList.add(firstRankRacer);
			}
		}
		for (RacerInfo racerInfo : firstRankList) {
			System.out.println(racerInfo.getName() + racerInfo.getRank() + racerInfo.getNumber());
		}
	}

	public void bestRacerInfoOfAll(Map<Integer, Map<Integer, RacerInfo>> raceResultMap) {
		ArrayList<RacerInfo> racerInfoArray = new ArrayList<>();
		for (Map.Entry<Integer, Map<Integer, RacerInfo>> outEntry : raceResultMap.entrySet()) {
			Map<Integer, RacerInfo> raceResults = outEntry.getValue();
			for (Map.Entry<Integer, RacerInfo> innerEntry : raceResults.entrySet()) {
				RacerInfo racerInfo = innerEntry.getValue();
				racerInfoArray.add(racerInfo);
			}
		}
		racerInfoArray.sort(Comparator.comparingDouble(RacerInfo::getTime));
		System.out.println(racerInfoArray.get(0).getName() + racerInfoArray.get(0).getTime());
	}

	public void worstRacerInfoOfAll(Map<Integer, Map<Integer, RacerInfo>> raceResultMap) {
		ArrayList<RacerInfo> racerInfoArray = new ArrayList<>();
		for (Map.Entry<Integer, Map<Integer, RacerInfo>> outEntry : raceResultMap.entrySet()) {
			Map<Integer, RacerInfo> raceResults = outEntry.getValue();
			for (Map.Entry<Integer, RacerInfo> innerEntry : raceResults.entrySet()) {
				RacerInfo racerInfo = innerEntry.getValue();
				racerInfoArray.add(racerInfo);
			}
		}
		racerInfoArray.sort(Comparator.comparingDouble(RacerInfo::getTime).reversed());
		System.out.println(racerInfoArray.get(0).getName() + racerInfoArray.get(0).getTime());
	}

	public void winnerRacerInfo(Map<Integer, Map<Integer, RacerInfo>> raceResultMap) {
		List<RacerInfo> racerInfoList = new ArrayList<>();
		for(Map<Integer, RacerInfo> racerInfoMap : raceResultMap.values()) {
			if(racerInfoMap.containsKey(1)) {
				racerInfoList.add(racerInfoMap.get(1));
			}
			if(racerInfoMap.containsKey(2)) {
				racerInfoList.add(racerInfoMap.get(2));
			}
		}
		for(RacerInfo racerInfo : racerInfoList) {
			System.out.println(racerInfo.getName() + racerInfo.getRank() + racerInfo.getNumber());
		}
	}	
		
		
//		Set<Map.Entry<Integer, Map<Integer, RacerInfo>>> racerInfoSet = new HashSet<>();
//		for (Map.Entry<Integer, Map<Integer, RacerInfo>> outEntry : raceResultMap.entrySet()) {
//			Map<Integer, RacerInfo> raceResults = outEntry.getValue();
//			for (Map.Entry<Integer, RacerInfo> innerEntry : raceResults.entrySet()) {
//				Integer rank = innerEntry.getKey();
//				if (rank <= 2) {
//					racerInfoSet.add(outEntry);
//				}
//			}
//		}
//		for (Map.Entry<Integer, Map<Integer, RacerInfo>> printMap : racerInfoSet) {
//			Map<Integer, RacerInfo> raceResults = printMap.getValue();
//			for (RacerInfo raceResult : raceResults.values()) {
//				System.out.println(raceResult.getName());
//			}
//		}
	

	public void top10RacerInfo(Map<Integer, Map<Integer, RacerInfo>> raceResultMap) {
		TreeSet<Map.Entry<Integer, RacerInfo>> racerInfoSet = new TreeSet<>(
				new Comparator<Map.Entry<Integer, RacerInfo>>() {
					@Override
					public int compare(Map.Entry<Integer, RacerInfo> e1, Map.Entry<Integer, RacerInfo> e2) {
						return Double.compare(e1.getValue().getTime(), e2.getValue().getTime());
					}
				});
		for (Map.Entry<Integer, Map<Integer, RacerInfo>> outEntry : raceResultMap.entrySet()) {
			Map<Integer, RacerInfo> raceResults = outEntry.getValue();
			for (Map.Entry<Integer, RacerInfo> innerEntry : raceResults.entrySet()) {
				if (!racerInfoSet.isEmpty() && racerInfoSet.size() >= 10) {
					if (racerInfoSet.last().getValue().getTime() < innerEntry.getValue().getTime()) {
						racerInfoSet.pollLast();
						racerInfoSet.add(innerEntry);
					}
				} else {
					racerInfoSet.add(innerEntry);
				}
			}
		}
		for (Map.Entry<Integer, RacerInfo> printMap : racerInfoSet) {
			System.out.println(printMap.getValue().getName());
			System.out.println(printMap.getValue().getTime());
			System.out.println(printMap.getValue().getNumber());
		}
	}
}