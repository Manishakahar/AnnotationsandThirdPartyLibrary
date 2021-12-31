package com.blz.csv;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteCSV {
    public static  void main(String[] args)  {
        String  path = "C:\\Users\\Dell\\Desktop\\manisha\\AnnotationsAndThirdPartyLibrary\\src\\main\\resources\\Demo.csv";
        try {
          Writer writer = Files.newBufferedWriter(Paths.get(path));
          StatefulBeanToCsv<CSVUser> beanToCsv = new StatefulBeanToCsvBuilder(writer).withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                  .build();
            List<CSVUser> users = new ArrayList<>();
            users.add(new CSVUser("Madhu", "abc@gmail.com",874521584,"India"));
            users.add(new CSVUser("Rahul", "xyz123@gmail.com",985248475,"India"));
            users.add(new CSVUser("Seema", "seema@gmail.com",854521598,"India"));
            users.add(new CSVUser("raj", "raj122@gmail.com",854521398,"India"));
            users.add(new CSVUser("Neha", "abc@123gmail.com",985452135,"India"));
            beanToCsv.write(users);
            writer.close();
        } catch (CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        } catch (CsvDataTypeMismatchException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
    }
}
