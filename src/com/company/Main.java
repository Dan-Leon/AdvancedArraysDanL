package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] supplies = {"Buns", "Hotdogs", "Relish", "Onions", "Tomatoes", "Sport Peppers", "Pickles", "Mustard",
                "Ketchup", "Fries", "Soda", "Paper Boats"};
        double[] inventory = {150, 175, 30, 50, 25, 16, 75, 230, 300, 215, 182, 575};
        int cont = 0;

         while (cont < 2){
             System.out.println("Please select from the following menu.");
             System.out.println("1. Item Look-up");
             System.out.println("2. Add count to inventory");
             System.out.println("3. Remove count from inventory");
             System.out.println("4. Inventory Report");
             System.out.println("5. Exit");
             int userSelection = getSelection("Please enter a number 1-5 and press Enter: ");

             switch (userSelection) {
                 case 1:
                     String key = getItem("Please enter the name of the item you wish to look up: ");
                     int lookUp = Arrays.binarySearch(supplies, key);
                     if (lookUp >= 0) {
                         System.out.println(supplies[lookUp] + "\n" + inventory[lookUp] + "\n");
                     } else {
                         System.out.println("That item was not found");
                     }
                     cont = getSelection("Please choose:\n1. Main Menu\n2. Exit");
                     break;
                 case 2:
                     key = getItem("Please enter the name of the item you wish to look up: ");
                     lookUp = Arrays.binarySearch(supplies, key);
                     if (lookUp >= 0) {
                         double dCount = inventory[lookUp];
                         double addCount = chngAmount("Please enter the amount you would like to add to " +
                                 "inventory: ");
                         inventory[lookUp] += addCount;
                         System.out.println("\t\t\t" + key);
                         System.out.println("old count:\t" + dCount);
                         System.out.println("added: \t\t" + addCount);
                         System.out.println("new count:\t" + inventory[lookUp]);
                         System.out.println("\n");
                     } else {
                         System.out.println("That item was not found");
                     }
                     cont = getSelection("Please choose:\n1. Main Menu\n2. Exit");
                     break;
                 case 3:
                     key = getItem("Please enter the name of the item you wish to look up: ");
                     lookUp = Arrays.binarySearch(supplies, key);
                     if (lookUp >= 0) {
                         double dCount = inventory[lookUp];
                         double subCount = chngAmount("Please enter the amount you would like to remove from " +
                                 "inventory: ");
                         inventory[lookUp] -= subCount;
                         System.out.println("\t\t\t" + key);
                         System.out.println("old count:\t" + dCount);
                         System.out.println("removed: \t" + subCount);
                         System.out.println("new count:\t" + inventory[lookUp]);
                         System.out.println("\n");
                     } else {
                         System.out.println("That item was not found");
                     }
                     cont = getSelection("Please choose:\n1. Main Menu\n2. Exit");
                     break;
                 case 4:
                     for (int index = 0; index < supplies.length; index++){
                         System.out.println(supplies[index] + "\n" + inventory[index] + "\n");
                     }
                    cont = getSelection("Please choose:\n1. Main Menu\n2. Exit");
                     break;
                 case 5:
                     System.out.println("You have exited the program.");
                     cont = 2;
                     break;
                 default:
                     System.out.println("You have made an invalid entry.");
             }

         }
        System.out.println("You have exited the program.");
    }

    private static int getSelection(String sLabel){
        int nItem;
        Scanner sc = new Scanner(System.in);
        System.out.print(sLabel);
        nItem = sc.nextInt();
        return nItem;
    }
    private static String getItem(String sLabel){
        String nItem;
        Scanner sc = new Scanner(System.in);
        System.out.print(sLabel);
        nItem = sc.next();
        return nItem;
    }
    private static double chngAmount(String sLabel) {
        double nItem;
        Scanner sc = new Scanner(System.in);
        System.out.print(sLabel);
        nItem = sc.nextDouble();
        return nItem;
    }

}
