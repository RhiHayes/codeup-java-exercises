import util.Person;

public class Employee extends Person {

    public Employee(String employeeName) {
        super(employeeName);
    }

    public int getAge() {
        return this.age;
    }

    public void sayHello() {
        System.out.println("Welcome to megacorp, how can I help you?"); //Overriding method
    }

    public void doWork() {
        System.out.println("Work, work...");
    } //Sub class


    public static void main(String[] args) {

        Employee rhi = new Employee("Rhi");

        rhi.sayHello();
        System.out.println("rhi.name = " + rhi.getName());

        rhi.doWork();


        Person unemployedJoe = new Person("Joe");

        unemployedJoe.sayHello();
        System.out.println("unemployedJoe.name = " +  unemployedJoe.getName());

//        unemployedJoe.doWork(); cannot use sub class on person

    }

}
