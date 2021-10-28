public class Student {

    public String name;
    public String cohort;
    private double grade;

    //Let's add a constructor - what is it? A METHOD OF OBJECT CREATION

    public Student(String studentName) {
//        name = studentName;
//        cohort = "Unassigned";

//Calling constructor inside of constructor :0

//        this(studentName, "Unassigned");

    }

    public Student(String studentName, String studentCohort, double grade) {
        this.name = studentName;
        this.cohort = studentCohort;
        this.grade = grade;
    }


    public static void main(String[] args) {

//        //Before constructors: [similar feel to JS?]
//        Student mcStudent = new Student();
//        mcStudent.name = "Ronald";
//        mcStudent.cohort = "Golden Arches";
//
//        System.out.println(mcStudent.name + " is in the " + mcStudent.cohort +
//        " cohort.");

        //First constructor experiment

        Student shanshan = new Student("Shanshan");

        System.out.println(shanshan.name + shanshan.cohort);

        //Second constructor experiment

        Student Kenneth = new Student("Kenneth H.", "Demios", 88);

        System.out.printf("%s is the student in the %s cohort and their grad is %s", Kenneth.name, Kenneth.cohort, Kenneth.grade);


    }


}
