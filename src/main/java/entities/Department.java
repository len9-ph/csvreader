package entities;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Department {
    private int ID;
    private String title;
    //private static AtomicInteger idCounter;

    public Department() {
        this.ID = 0;
        this.title = "";
    }
    public Department(String title){
        this.ID = createID();
        this.title = title;
    }

    public int getID() {
        return ID;
    }

    public int createID() {
        Random random = new Random();
        return random.ints(0, 10).findFirst().getAsInt();
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public  String toString() {
        return "\nID: " + this.getID() + "\nName: " + this.getTitle();
    }
}
