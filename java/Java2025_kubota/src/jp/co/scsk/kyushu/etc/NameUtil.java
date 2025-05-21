package jp.co.scsk.kyushu.etc;

public class NameUtil {

    private static final String DATA =
    		"あいうえおかきくけこさしすせそたちつてとなにぬねの" +
    		"はひふへほやゆよらりるれろわんがぎぐげござじずぜぞ" +
    		"だぢづでどばびぷぺぼぱぴぷぺぽ";
    private static final int DATALEN = DATA.length();

    public static String createName() {
        int len = (int)(Math.random() * 4) + 3;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            int pt = (int)(Math.random() * DATALEN);
            sb.append(DATA.substring(pt, pt + 1));
        }
        return sb.toString();
    }

}
