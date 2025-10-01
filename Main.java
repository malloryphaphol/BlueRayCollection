import java.util.Scanner;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        BlueRayCollection blueRayCollection = new BlueRayCollection();
        int userChoice = 3;
        String title;
        String director;
        int year;
        double cost;
        while (userChoice != 0) {
            System.out.println("0. Quit\n1. Add BlueRay to collection\n2. See Collection");
            userChoice = userInput.nextInt();
            if (userChoice == 1) {
                //adding to collection
                userInput.nextLine();
                System.out.println("What is the title? ");
                title = userInput.nextLine();
                System.out.println("What is the director? ");
                director = userInput.nextLine();
                System.out.println("What is the year? ");
                year = userInput.nextInt();
                System.out.println("What is the cost? ");
                cost = userInput.nextDouble();
                blueRayCollection.add(title, director, year, cost);
                System.out.println();
            }
            else if (userChoice == 2) {
                //print collection
                blueRayCollection.show_all();
            }
        }
    }
}
