package com.company;

import java.util.Scanner;

public class Main {



    private  static  String triangle;
    private  static  String equi;
    private  static  String nonequi;

    public static void main(String[] args) {
	// write your code here
          int lenght1 =0;
          int lenght2 = 0;
          int lenght3 = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the lenght for side a: ");
        int length1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("enter the lenght for side b: ");
        int length2 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("enter the lenght for side c: ");
        int length3 = keyboard.nextInt();
        keyboard.nextLine();


        if (lenght1 == lenght2 && lenght2 == lenght3 && lenght1 == lenght3) {
            System.out.println(" The lenght of side a is " + length1);
            System.out.println(" The lenght of side b is " + length2);
            System.out.println(" The lenght of side c is " + length3);
            System.out.println(lenght2 == lenght3);
                 triangle = "equilateral";
             }
         else if(( lenght1 * lenght1) == (lenght2 *lenght2) + (lenght3 *lenght3))
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
