package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);



        String firstInitial;
        String lastName;
        int houseNumber;
        String streetName;
        String streetType;
        String city;

//        System.out.print("First Initial: ");
//        firstInitial = keyboard.next();
//        System.out.print("Last Name: ");
//        lastName = keyboard.next();
//        System.out.print("House Number: ");
//        houseNumber = keyboard.nextInt();
//        System.out.print("Street Name: ");
//        streetName = keyboard.next();
//        System.out.print("Street Type: ");
//        streetType = keyboard.next();
//        System.out.print("City: ");
//        city = keyboard.next();

        firstInitial = keyboard.next();
        lastName = keyboard.next();
        houseNumber = keyboard.nextInt();
        streetName = keyboard.next();
        streetType = keyboard.next();
        city = keyboard.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
