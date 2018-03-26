package model;

/**
 * This class is in charge of keeping track of teacher's id, name and salary.
 */
public class Teacher {

    private int salaryEarned;
    private int id;
    private String name;
    private int salary;

    /**
     * Creates new model.Teacher object
     * @param id id of the teacher.
     * @param name name of tnhe teacher.
     * @param salary salary for the teacher.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }
    //We don't need setter for id and name because they are constant for each teacher, but we need the setter
    //for the salary as teacher's salary vary at different positions.

    /**
     *
     * @return the name of the current teacher.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return id of the current teacher.
     */
    public int getId() {
        return id;
    }

    /**
     * @return salary for the current teacher.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * sets teachers salary
     * @param salary teacher's salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds salary received to the salary field.
     * Removes
     * @param receivedSalary
     */
    public void receiveSalary(int receivedSalary) {
        salaryEarned+=receivedSalary;
        School.updateTotalMoneySpent(receivedSalary);
    }

    public int getSalaryEarned() {
        return salaryEarned;
    }
}
