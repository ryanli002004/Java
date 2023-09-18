package mypackage;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if ((number%3==0)&&(number%5!=0)){
            System.out.println("Buzz");
        }
        if ((number%3!=0)&&(number%5==0)){
            System.out.println("Fizz");
        }
        if ((number%3==0)&&(number%5==0)){
            System.out.println("FizzBuzz");
        }
        if ((number%3!=0)&&(number%5!=0)){
            System.out.println(number);
        }
    }
    
}
