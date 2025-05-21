package jp.co.scsk.kyushu.exceptionSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputUtil {

    public static ArrayList<String> input() {
         System.out.println("数値をカンマ区切りで入力して下さい。");
         BufferedReader br = null;
         try {
             br = new BufferedReader(new InputStreamReader(System.in));
             String inputStr = br.readLine();
             String[] splitStr = inputStr.split(",");
             ArrayList<String> strList = new ArrayList<String>();
             if (splitStr.length == 0) {
            	strList.add(null);
            	strList.add(null);
             }
             else if (splitStr.length == 1) {
            	 strList.add(splitStr[0].isEmpty() ? null : splitStr[0]);
            	 strList.add(null);
             }
             else {
            	 strList.add(splitStr[0].isEmpty() ? null : splitStr[0]);
            	 strList.add(splitStr[1].isEmpty() ? null : splitStr[1]);
             }
             return strList;
         } catch (IOException e) {
             return null;
         } finally {
             if (null != br) {
                 try {
                    br.close();
                } catch (IOException e) {
                    // 未処理
                }
             }
         }
    }
}