package com.tts;
import java.util.Scanner;

public class MadLib {



    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);
        // comment out this int ageLimit initializer will result in an error: cannot find symbol: symbol: variable ageLimit
        // if no value is stated for variable you will get illegal start of expression error
        // illegal field names (ex. _ageLimit, 1ageLimit,...) will result in error: cannot find symbol; but AgeLimit is OK, no error
       int ageLimit= 18;
System.out.println(ageLimit);

        System.out.println("How old are you?");

        int age = Integer.parseInt(userInput.nextLine());

        if (age<ageLimit) {
            System.out.print("you are too young! Sorry!\n");
        }
        else{
            //Scanner userInput = new Scanner(System.in);
            System.out.println("Enter a name: ");
        }



    }






}