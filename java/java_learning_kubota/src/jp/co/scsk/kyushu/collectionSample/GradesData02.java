package jp.co.scsk.kyushu.collectionSample;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesData02 {

    public static void main(String[] args) {

        HashMap<String, Integer> studentScore = new HashMap<>();
        Data02 data02 = new Data02();
        String[] names = data02.getNames();
        int[] points = data02.getPoints();

        for (int i = 0; i < names.length; i++) {
            if (studentScore.containsKey(names[i])) {
                if (studentScore.get(names[i]) < points[i]) {
                    studentScore.put(names[i], points[i]);
                }
            } else {
                studentScore.put(names[i], points[i]);
            }
        }

        // キーをリストに変換
        ArrayList<String> mapKeys = new ArrayList<>(studentScore.keySet());

        // バブルソートアルゴリズムによるソート
        for (int i = 0; i < mapKeys.size() - 1; i++) {
            for (int j = 0; j < mapKeys.size() - 1 - i; j++) {
                if (studentScore.get(mapKeys.get(j)) < studentScore.get(mapKeys.get(j + 1))) {
                    // スコアが低い場合は位置を交換
                    String temp = mapKeys.get(j);
                    mapKeys.set(j, mapKeys.get(j + 1));
                    mapKeys.set(j + 1, temp);
                }
            }
        }

        // 出力結果
        for (String name : mapKeys) {
            System.out.println(name + ": " + studentScore.get(name));
        }
    }
}