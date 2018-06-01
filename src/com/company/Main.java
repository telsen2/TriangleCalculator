package com.company;

import java.util.Scanner;

public class Main {



    private  static  String triangle;
    private  static  String equi;
    private  static  String nonequi;

    public static void main(String[] args) {
	// write your code here
         // int len1 = 0;   // using len for 'lenght'//
         // int len2 = 0;
         // int len3 = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the lenght for side a: ");
        int len1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("enter the lenght for side b: ");
        int len2 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("enter the lenght for side c: ");
        int len3 = keyboard.nextInt();
        keyboard.nextLine();


        if (len1 == len2 && len2 == len3 && len1 == len3) {
            System.out.println(" The lenght of side a is " + len1);
            System.out.println(" The lenght of side b is " + len2);
            System.out.println(" The lenght of side c is " + len3);
            System.out.println(len2 == len3);
                 triangle = "equilateral";
             }
         else if(( len1 * len1) == (len2 *len2) + (len3 *len3))
                {
                triangle = "right triangle";
                }
              //  System.out.println(" The triangle is a right triangle");}
         else  {
                triangle = "not a right triangle";
               }
            System.out.println(" The triangle is " + triangle );
    }
}
