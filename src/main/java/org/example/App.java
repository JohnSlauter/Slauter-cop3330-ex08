package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner s = new Scanner(System.in);

        int num_people, num_pizza, slices_per_pizza, total_slices, slices_per_person, remain;

        String temp;

        System.out.print("How many people? ");

        temp = s.nextLine();

        num_people = String_to_int(temp);

        System.out.print("How many pizzas do you have? ");

        temp = s.nextLine();

        num_pizza = String_to_int(temp);

        System.out.print("How many slices per pizza? ");

        temp = s.nextLine();

        slices_per_pizza = String_to_int(temp);

        total_slices = num_pizza * slices_per_pizza;

        slices_per_person = total_slices / num_people;

        remain = total_slices % num_people;

        System.out.print(num_people + " people with " + num_pizza + " pizzas (" + total_slices + " slices)" +
                "\nEach person gets " + slices_per_person + " pieces of pizza." +
                "\nThere are " + remain + " leftover pieces.");

        s.close();

    }

    private static int String_to_int(String s){

        int res = 0;

        for(int i = 0; i < s.length(); i++){

            res += (s.charAt(i)-'0')*pow(10, s.length()-1-i);

        }

        return res;

    }

    private static int pow(int base, int exponent){

        int res = 1;

        for(int i = 0; i < exponent; i++){

            res *= base;

        }

        return res;

    }

}
