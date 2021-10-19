package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int order, noDeals;
        System.out.println("|*--------------------------MENU--------------------------*|");
        System.out.println();
        System.out.println("(1) Banku with Tilapia                            $2 only");
        System.out.println("(2) Fufu with Chick Soup                          $4 only");
        System.out.println("(3) Plain Rice with Chicken Stew                  $2.5 only");
        System.out.println("(4) Roasted Pork                                  $5 only");
        System.out.println("(5) Jollof Rice with Chicken                      $3 only");
        System.out.println("(6) 2.5 Litre Coke                                $1.5 only");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the order number: ");
        order = scanner.nextInt();
        System.out.println("Please select the number of deals: ");
        noDeals = scanner.nextInt();
        System.out.println();

        switch (order){
            case 1:
                System.out.println("Order : Banku with Tilapia.");
                System.out.println("Number of deals : " + noDeals);
                System.out.println("Price of each deals: $2 only.");
                System.out.println("Total price : $" + 2 * noDeals + " only.");
        }




    }
}
