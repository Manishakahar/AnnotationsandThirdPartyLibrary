package com.blz.csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class OpenCSVReader {
    public static void main(String[] args) throws IOException, CsvException {
        String csvPath = "C:\\Users\\Dell\\Desktop\\manisha\\AnnotationsAndThirdPartyLibrary\\src\\main\\java\\com\\blz\\csv\\User1.csv";
        Reader reader = Files.newBufferedReader(Paths.get(csvPath));
        CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder(reader).withType(CSVUser.class).build();
        List<CSVUser> csvUsers = csvToBean.parse();
        System.out.println(csvUsers);
       // CSVReader csvReader = new CSVReader(reader);
//        String[] nextRecord;
//        int count = 0;
//        csvReader.readNext();
//        while ((nextRecord = csvReader.readNext()) != null) {
//            count++;
//            if (count==1){
//                continue;
//            }
//            System.out.println("Name " + nextRecord[0]);
//            System.out.println("Email " + nextRecord[1]);
//            System.out.println("Phone " + nextRecord[2]);
//            System.out.println("Country " + nextRecord[3]);
//            System.out.println();
//        }
        // for this method we not required extra memory.
//        List<String[]>list = csvReader.readAll();
//        for (String[] array :list) {
//            System.out.println("Name :" +array[0]);
//            System.out.println("Email :" +array[1]);
//            System.out.println("Phone :" +array[2]);
//            System.out.println("Country :" +array[3]);
//        }
//        System.out.println();

    }
}
