package mypackage;

import java.util.Scanner;

public class Forth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true){
            System.out.print("input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0 ; i<fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
