package jp.co.scsk.kyushu.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteSample {

	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir") + "\\resource\\output.txt");
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] datas = {"AAA", "BBB", "CCC", "DDD", "EEE"};
		try {
			for (String data : datas) {
				fileWriter.write(data + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
