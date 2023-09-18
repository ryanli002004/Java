package mypackage;

import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        for (int i = 5; i>0; i--)
            System.out.println("hello world" +i);

        int i = 5;
        while (i>0) {
            System.out.println("while loop" + i);
            i--;
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while(!input.equals("quit"));
    }
}
