package Interfaces_Abstract_Lec;

public class Accountant extends Employee {

    public Accountant(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "TPS Reports have been drafted!";
    }


    public String morningMeeting() {
        return "Accountants talk about stonks";
    }


    public String lunchTime() {
        return "They eat at their desk when they want to.";
    }


    public int dailyPay() {
        return 500;
    }

    ;


}
