package InputOutput;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import entities.Department;
import entities.Human;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CsvReader {
    private List<Human> humans;

    public CsvReader() {
        this.humans = new LinkedList<>();
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }

    public void readCSV(String pathToCSV, char separator) {
        try(FileReader in = new FileReader(pathToCSV)) {
            CSVParser parser = new CSVParserBuilder().withSeparator(separator).build();
            CSVReader reader = new CSVReaderBuilder(in).withCSVParser(parser).withSkipLines(1).build();
            if(reader == null) throw new FileNotFoundException(pathToCSV);

            String[] line;
            while((line = reader.readNext()) != null) {
                Human man = new Human(Integer.parseInt(line[0]), line[1], line[2], new Department(line[4]), Integer.parseInt(line[5]), line[3]);
                humans.add(man);
            }

        } catch (IOException | CsvValidationException e ) {
            e.printStackTrace();
        }
    }

    public void printCSV() {
        for (Human human : humans) {
            System.out.println(human.toString());
            System.out.println();
        }
    }
}
