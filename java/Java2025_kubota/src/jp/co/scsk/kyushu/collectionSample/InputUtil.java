package jp.co.scsk.kyushu.collectionSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUtil {

    public static String input() {
         System.out.println("文字を入力して下さい。");
         BufferedReader br = null;
         try {
             br = new BufferedReader(new InputStreamReader(System.in));
             return br.readLine();
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