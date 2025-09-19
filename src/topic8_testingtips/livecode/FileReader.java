package topic8_testingtips.livecode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class FileReader {

    public static ArrayList<String> readFile(String filename) {
        try {
            Path path = Paths.get(filename);
            ArrayList<String> allLines = new ArrayList<>(Files.readAllLines(path));
            return allLines;
        } catch (IOException exp) {
            return new ArrayList<>();
        }
    }

    public static int population(String filename, String countryParam, String regionParam){
        int population = 0;
        for(String line : readFile(filename)){
            // zm,chipata,06,85973,-13.6333333,32.65
            ArrayList<String> splits = new ArrayList(Arrays.asList(line.split(",")));
            String country = splits.get(0);
            String region = splits.get(2);
            try {
                int cityPopulation = Integer.valueOf(splits.get(3));
                if (country.equals(countryParam) && region.equals(regionParam)) {
                    population += cityPopulation;
                }
            }catch(NumberFormatException exp){

            }
        }
        return population;
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("9000"));
    }

}
