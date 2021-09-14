/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What is the first number?");
    int num1 = sc.nextInt(); //asks user to input number

    System.out.println("What is the second number?");
    int num2 = sc.nextInt(); //asks user to input second number

    System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); //adds both numbers together 
    System.out.println(num1 + " - " + num2 + " = " + (num1-num2)); // subtracts both numbers together
    System.out.println(num1 + " * " + num2 + " = " + (num1*num2)); //multiplies both numbers together
    System.out.println(num1 + " / " + num2 + " = " + (num1/num2)); //divided both numbers together 

  }
}