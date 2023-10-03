package practice;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args){
        boolean first = false;
        boolean second = false;
        boolean third = false;
        boolean forth = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This word is something that we grow");
        while (true){
            String guess = scanner.next();
            if (guess.equals("h")){
                first = true;
                System.out.println("congrats you guessed a letter!");
            }            
            else if (guess.equals("a")){
                second = true;
                System.out.println("congrats you guessed a letter!");
            }
            else if (guess.equals("i")){
                third = true;
                System.out.println("congrats you guessed a letter!");
            }
            else if (guess.equals("r")){
                forth = true;
                System.out.println("congrats you guessed a letter!");
            }
            else{
                System.out.println("sorry that letter is not in the word.");
            }
            if (first==true){
                System.out.print("h");
            }
            else{
                System.out.print("*");
            }
            if (second==true){
                System.out.print("a");
            }
            else{
                System.out.print("*");
            }
            if (third==true){
                System.out.print("i");
            }
            else{
                System.out.print("*");
            }
            if (forth==true){
                System.out.print("r");
            }
            else{
                System.out.print("*");
            }
            System.out.println();
            if ((first==true)&&(second==true)&&(third==true)&&(forth==true)){
                break;
            }
        }
        System.out.println("Congratuations you guessed the word!");
    }
}
