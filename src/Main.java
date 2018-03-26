import model.School;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher john = new Teacher(3, "John", 500);

        Student tanasha = new Student(1, "Tanasha", 5);
        Student mary = new Student(2, "Mary", 7);
        Student tom = new Student(3, "Tom", 10);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(lizzy);
        teachers.add(melissa);
        teachers.add(john);

        List<Student> students = new ArrayList<>();
        students.add(tanasha);
        students.add(mary);
        students.add(tom);

        School riverSide = new School(teachers, students);

        tanasha.payFees(5000);
        mary.payFees(7000);
        tom.payFees(20000);
        tom.payFees(10000);
        System.out.println("RiverSide has earned: $" + riverSide.getTotalMoneyEarned());

        lizzy.receiveSalary(150);
        melissa.receiveSalary(250);
        System.out.println("RiverSide has: $" + riverSide.getTotalMoneyEarned() + " after paying the teachers");
    }
}
