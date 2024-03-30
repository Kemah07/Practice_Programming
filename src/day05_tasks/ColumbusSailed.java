package day05_tasks;
/*
Create a class called ColumbusSailed in your Practice_Programming project and inside the day04_tasks package 

        Task:
                WRITE A JAVA PROGRAM CODE FOR:
                    ASSIGN THE VALUE "IN 1491 COLUMBUS SAILED THE OCEANBLUE" TO AN APPROPRIATE VARIABLE,
                WRITE A PROGRAM IN JAVA TO CHANGE THE YEAR IN THE STATEMENT ABOVE FROM 1491 TO 1492.
                
 */

public class ColumbusSailed {
    public static void main(String[] args) {
        String name = "Columbus";
        String location = "Oceanblue";
        int year = 1491;

        System.out.println("In " + year + " " + name + " " + "sailed the" + " " +location);
        System.out.println();
        year = 1492;
        System.out.println("In " + year + " " + name + " " + "sailed the" + " " +location);


    }
}
