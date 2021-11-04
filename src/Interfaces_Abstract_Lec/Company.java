package Interfaces_Abstract_Lec;

public class Company { //My Company

    public static void main(String[] args) {

        Accountant accountBot = new Accountant("numberBot", "Accounting");

        Custodian cleanerBot = new Custodian("CleanerBot9000", "Maintenance");

//        System.out.println(accountBot.work());
//        System.out.println(accountBot.getName());
//        System.out.println(accountBot.getDepartment());
//
//
//        System.out.println(cleanerBot.work());
//        System.out.println(cleanerBot.getName());
//        System.out.println(cleanerBot.getDepartment());

        //How does our work day go?

        System.out.println(accountBot.getName() + "is reporting for business for the " + accountBot.getDepartment());

        System.out.println(cleanerBot.getName() + "is reporting for business for the " + cleanerBot.getDepartment());


        System.out.println("accountBot's morning:" + accountBot.morningMeeting());
        System.out.println("cleanerBot's morning:" + cleanerBot.morningMeeting());

        System.out.println("accountBot's lunch:" + accountBot.lunchTime());
        System.out.println("cleanerBot's lunch:" + cleanerBot.lunchTime());

        System.out.println("accountBot's work:" + accountBot.work());
        System.out.println("cleanerBot's work:" + cleanerBot.work());

        System.out.println("accountBot's daily pay:" + accountBot.dailyPay());
        System.out.println("cleanerBot's daily pay:" + cleanerBot.dailyPay());

    }

}
