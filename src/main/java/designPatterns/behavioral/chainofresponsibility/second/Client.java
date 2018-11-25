package designPatterns.behavioral.chainofresponsibility.second;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<String> fileList = populateFiles();
        Parser xmlParser = new XmlParser();
        Parser csvParser = new CsvParser(xmlParser);
        Parser jsonParser = new JsonParser(csvParser);
        Parser textParser = new TextParser(jsonParser);

        for ( String fileName : fileList){
            textParser.parse(fileName);
        }
    }

    private static List<String> populateFiles(){
        List<String> fileList = new ArrayList<>();
        fileList.add("someFile.txt");
        fileList.add("otherFile.json");
        fileList.add("xmlFile.xml");
        fileList.add("csvFile.csv");
        fileList.add("csvFile.doc");
        return fileList;
    }
}

