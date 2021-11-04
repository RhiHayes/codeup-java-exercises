package Interfaces_Abstract_Lec;

public class Custodian extends Employee {

    public Custodian(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "Maintaining the building - cleaning up messes!";
    }


    public String morningMeeting() {
        return "Custodians have a direct report to the head of the " +
                "Maintenance department.";
    }


    public String lunchTime() {
        return "12:00 - 1:00PM ";
    }


    public int dailyPay() {
        return 180;
    }
}
