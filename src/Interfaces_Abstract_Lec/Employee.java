package Interfaces_Abstract_Lec;

abstract class Employee implements DailyWork{

    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public static void main(String[] args) {
        //Employee rhi = new Employee("Rhi", "Web Dev"); // Doing this with abstract
        //classes will NOT work! NO INSTANTIATING! This is an abstract class



    }


}
