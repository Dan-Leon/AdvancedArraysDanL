package com.company;

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
                     String item = getItem("Please enter the name of the item you wish to look up: ");
                     for (int i = 0; i < supplies.length; i++) {
                         if (supplies[i] == item){
                             System.out.println(supplies[i]);
                             for (int j = 0; j < item.length(); j++) {
                                 char c = item.charAt(j);
                                 System.out.println("_");
                             }
                             System.out.println(inventory[i]);
                         }
                     }


                     cont = getSelection("Please choose:\n1. Main Menu\n2. Exit");
                     break;
                 case 2:

                     cont = getSelection("Please choose:\n1. Main Menu\n2. Exit");
                     break;
                 case 3:

                     cont = getSelection("Please choose:\n1. Main Menu\n2. Exit");
                     break;
                 case 4:

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




}
