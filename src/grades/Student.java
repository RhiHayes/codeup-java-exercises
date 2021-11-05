package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name)  { //Initializes Students

        this.name = name;
        this.grades = new ArrayList<>();

    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {

        double totalGrades = 0; //For loop that calculates grade average
        for (double grade : grades) {
            totalGrades += grade;
        }

        return totalGrades / grades.size();
    }


    public static void main(String[] args) {
        Student rhi = new Student("Rhiannon");
        rhi.addGrade(89);
        rhi.addGrade(82);
        rhi.addGrade(90);
        System.out.printf("Rhi's average grade = %.2f\n", rhi.getGradeAverage());
    }


}
