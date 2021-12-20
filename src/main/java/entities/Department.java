package entities;

import java.util.Random;

/**
 * Class describing an entity Department
 * @see Human
 */
public class Department {
    private int ID;
    private String title;


    /**
     * Default constructor
     */
    public Department() {
        this.ID = 0;
        this.title = "";
    }

    /**
     * Constructor with parameters
     * @param title - title of Department
     */
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
