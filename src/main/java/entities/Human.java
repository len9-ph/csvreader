package entities;

public class Human {
    private int ID;
    private String name;
    private String gender;
    private Department department;
    private int salary;
    private String birthday;

    public Human() {
        this.ID = 0;
        this.name = "";
        this.gender = "";
        this.department = null;
        this.salary = 0;
        this.birthday = null;
    }

    public Human(int ID, String name, String gender, Department department, int salary, String birthday) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.birthday = birthday;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "ID: " + this.getID() +
                "\nName: " + this.getName() +
                "\nGender: " + this.getGender() +
                "\nSalary: " + this.getSalary() +
                "\nBirthday: " + this.getBirthday() + department.toString();
    }
}
