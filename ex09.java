/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program calculates gallons of paint needed to paint the ceiling of a room
import java.util.Scanner;
public class ex09{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
    //declaring variables
    int pergallon = 350;

    //asks for user input
    System.out.print("Enter length: ");
       int length = input.nextInt();
    System.out.print("Enter width: ");
       int width = input.nextInt();
       int total = length*width;
       int gallon = (int)Math.ceil(total/pergallon);

    //prints the amount of paint needed   
    System.out.println("You will need to purchase "+gallon+" of paint to cover "+total+" squre feet");
   }//end of main
}//end of class