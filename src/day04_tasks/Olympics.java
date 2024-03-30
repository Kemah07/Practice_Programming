package day04_tasks;
/*
Create a class called Olympics in your Practice_Programming project and inside the day04_tasks package

        Task:
            Create a main method
            create a variable for the year
            print the country and year for next couple events reassigning year value each time.

            Country name is hard coded
            Info:
                China 2022
                France 2024
                Italy 2026

//            Example Output
//                Look forward to the year 2002 for the Olympics to be in China
 */

public class Olympics {
    public static void main(String[] args){
        int year;
        System.out.println("Olympics have been and will be held in these countries ");
        year = 2022;
        System.out.println("\tLook forward to the year" + year + "for the Olympics to be in China");
        year = 2024;
        System.out.println("\tLooking forward to the year " + year + " for the Olympics to be in France");

        year = 2026;
        System.out.println("\tLooking forward to the year " + year + " for the Olympics to be in Italy");




    }
}
