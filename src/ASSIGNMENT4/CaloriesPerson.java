package ASSIGNMENT4;

import java.util.Scanner;

public class CaloriesPerson {
    public static void main(String[]args){
        double calories,bodyWight;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the persons bodyWight");
        bodyWight= keyboard.nextDouble();
        calories= bodyWight*19;
        System.out.print(" calories  is " + calories);
    }
}
