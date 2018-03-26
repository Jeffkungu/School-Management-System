package model;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Creates a new model.Student object and initialises the fields to parameter values.
     * Fees for every student is $30,000 per year.
     * Fees paid initialy is 0.
     * @param id id of model.Student: unique value
     * @param name name of student
     * @param grade grade of student
     */
    public Student(int id, String name, int grade) {

        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this .feesTotal = 30000;
    }


    public int getGrade() {
        return grade;
    }

    /**
     * Used to update student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * The school is going to receive the funds.
     * This method keeps adding the fees received to the original feesPaid value.
     * @param fees
     */
    public void payFees(int fees) {
        feesPaid+=fees;
        School.updateTotalMoneyEarned(fees);
    }

    /**
     *
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return student's name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return feesPaid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees that should be paid by the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees() {
        return feesTotal-feesPaid;
    }

}
