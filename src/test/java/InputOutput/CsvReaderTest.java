package InputOutput;

import entities.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CsvReaderTest {
    CsvReader reader;

    @BeforeEach
    void setUp() {
        reader = new CsvReader();
    }

    @Test
    void ifAllLinesBeeReadTest(){
        reader.readCSV("C:\\Users\\leoni\\Documents\\University\\Java applications\\csvreader\\src\\main\\resources\\foreign_names.csv", ';');
        int expectedValue = reader.getHumans().get(reader.getHumans().size()-1).getID();
        int actualValue = 54178;

        assertEquals(expectedValue, actualValue);
    }
    @Test
    void allLinesNotEmpty() {
        boolean notEmpty = true;
        reader.readCSV("C:\\Users\\leoni\\Documents\\University\\Java applications\\csvreader\\src\\main\\resources\\foreign_names.csv", ';');
        for(int i = 0; i < reader.getHumans().size(); i++) {
            System.out.println(i);
            if(!isLineEmpty(reader.getHumans().get(i)))
                notEmpty = false;
        }
        assertTrue(notEmpty);
    }
    private boolean isLineEmpty(Human man) {
        return man.getID() != 0 && man.getName() != null && man.getGender() != null && man.getBirthday() != null && man.getDepartment() != null && man.getSalary() != 0;
    }
}