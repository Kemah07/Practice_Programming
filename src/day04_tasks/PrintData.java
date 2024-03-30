package day04_tasks;
/*
Create a class called PrintDate in your Practice_Programming project and inside the day04_tasks package

        Task:
            Create a main method
            declare and assign 3 variables
            the month number, the day number, and year number
            print the date in the following format using concatenation:
                month/day/year

            print the date in the following format:
                month_day_year

            print the date in the following format:
                month-day-year

            print the date in the following format:
                month|day|year

            print the date in the following format:
                month<>day<>year
 */
public class PrintData {
    public static void main(String[] args){

        int month = 8;
        int day = 7;
        int year = 1988;

        System.out.println(month + "/" + day + "/" + year);
        System.out.println(month + "_" + day + "_" + year);
        System.out.println(month + "-" + day + "-" + year);
        System.out.println(month + "|" + day + "|" + year);
        System.out.println(month + "<>" + day + "<>" + year);


    }
}
