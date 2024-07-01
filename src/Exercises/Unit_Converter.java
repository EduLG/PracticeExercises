package Exercises;

import java.util.Scanner;


public class Unit_Converter {


    public static void main(String[] args) {
        System.out.println("give me a unit of degrees in ºC");
        Scanner user = new Scanner(System.in);
        int value = user.nextInt();
        int kelvin = value + 273;
        System.out.println("your temperature in K would be " + kelvin + "ºk");


    }
}
