package day05_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName, lastName, companyName, jobTitle;
        char gender, suite;
        double salary;
        int age, numberOfPto;
        boolean areFullTime, areTheyMarried;

        lastName = "Bond";
        firstName = "James";
        gender = 'M';
        age = 40;
        companyName = "MI6";
        areFullTime = true;
        jobTitle = "Special Agent";
        salary = 100_000.00;
        numberOfPto = 15;
        areTheyMarried = false;
        suite = 'D';

        System.out.println("First name:\t\t" + firstName);
        System.out.println("last name:\t\t" + lastName);
        System.out.println("Gender:\t\t\t" + gender);
        System.out.println("Age:\t\t\t" + age);
        System.out.println("Company name:\t" + companyName);
        System.out.println("Full time:\t\t" + areFullTime);
        System.out.println("Job title:\t\t" + jobTitle);
        System.out.println("Salary:\t\t\t" + "$" + salary);
        System.out.println("Number of PTO:\t" + numberOfPto);
        System.out.println("Married:\t\t" + areTheyMarried);
        System.out.println("Suite:\t\t\t" + suite);

        System.out.println();


        String allDetail = "Employment information for: "+ firstName + " " +lastName + "\n\tSpecial agent at "
                +companyName + "\n\tCurrently " + age + " years old" + "\n\t" + companyName + " is located in "
                + suite + "\n\tThis year's salary comes to " + salary + "\n\tOther Details: " + "\n\tPTO: "
                + age + "\n\tFull time? " + areFullTime + "\n\tMarried? " + areTheyMarried;

        System.out.println(allDetail);







    }
}
