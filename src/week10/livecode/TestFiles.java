package week10.livecode;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TestFiles {

    public static ArrayList<String> readFile(String filename) {
        try {
            Path path = Paths.get(filename);
            ArrayList<String> allLines = new ArrayList<>(Files.readAllLines(path));
            return allLines;
        } catch (IOException exp) {
            return new ArrayList<>();
        }
    }


    @Test
    public void testReadFile(){
        String filename = "data/test_cities_0.csv";
        ArrayList<String> actual = FileReader.readFile(filename);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(
                "Country,City,Region,Population,Latitude,Longitude",
                "ad,la massana,04,7211,42.55,1.5166667",
                "ad,les escaldes,08,15854,42.5,1.5333333"
        ));

        assertEquals(expected, actual);
    }


    @Test
    public void testPopulation(){
        String filename = "data/cities.csv";
        String country = "us";
        String region = "NY";
        int actual = FileReader.population(filename, country, region);
        int expected = 12992289;

        assertEquals(expected, actual);
    }
    @Test
    public void testPopulation2(){
        String filename = "data/cities.csv";
        String country = "ad";
        String region = "04";
        int actual = FileReader.population(filename, country, region);
        int expected = 7211;

        assertEquals(expected, actual);
    }
    @Test
    public void testPopulation3(){
        String filename = "data/cities.csv";
        String country = "zw";
        String region = "07";
        int actual = FileReader.population(filename, country, region);
        int expected = 219928;

        assertEquals(expected, actual);
    }

}
