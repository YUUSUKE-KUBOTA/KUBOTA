package jp.co.scsk.kyushu.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercises01 {
    public static void main(String[] args) {
        File inputFile = new File(System.getProperty("user.dir") + "\\resource\\input.txt");
        File outputFile = new File(System.getProperty("user.dir") + "\\resource\\output.txt");
        
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFile));
            fileWriter = new FileWriter(outputFile);

            SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy/MM/d");
            SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy/MM/dd");

            String data;
            while ((data = bufferedReader.readLine()) != null) {
                String[] values = data.split(",");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(inputDateFormat.parse(values[2]));
                calendar.add(Calendar.DATE, Integer.parseInt(values[3]));

                String outputData = String.format("%s,%s,%s",
                    values[0], values[1], outputDateFormat.format(calendar.getTime()));
                fileWriter.write(outputData + System.lineSeparator());
                System.out.println(outputData);
            }

        } catch (IOException | java.text.ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}