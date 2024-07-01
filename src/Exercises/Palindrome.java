package Exercises;

import java.util.Scanner;


public class Palindrome {


    public static void main(String[] args) {
        System.out.println("Give me a sentence. I'll guess if it is a palindrome or not.");
        Scanner user = new Scanner(System.in);
        String palin = user.nextLine();
        char[] drome = new char[palin.length()];
//Create an array to invert
        for (int i=0;i<palin.length();i++){
            drome[i] = palin.charAt(i);
        }

//Check if the array has been created properly
//        for (int j=0;j<palin.length();j++){
//            System.out.println(drome[j]);
//        }

//Check if it is a palindrome
        boolean comparative = true;
        for(int k=0;k<(drome.length)/2; k++){
            if(drome[k] != drome[drome.length-1-k]){
                comparative = false;
                break;
            }
        }

        if (comparative == true)
            System.out.println("Is palindrome");
        else
            System.out.println("Is not palindrome");

        user.close();
    }
}
