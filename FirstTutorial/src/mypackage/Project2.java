package mypackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] argso){
        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        System.out.print("Principal ($1K - $1M: )");
        principal = scanner.nextInt();
        while (!((principal>=1000)&&(principal<=1000000))){
            System.out.println("Enter a number between 1,000 and 1,000,000");
            System.out.print("Principal ($1K - $1M: )");
            principal = scanner.nextInt();
            }
        float interestRate = 0;
        System.out.print("Annual Interest Rate: ");
        interestRate = scanner.nextFloat();
        while (!((interestRate>0)&&(interestRate<30))){
            System.out.println("Enter a number greater than 0 and less than 30");
            System.out.print("Annual Interest Rate: ");
            interestRate = scanner.nextFloat();
            }
        byte years = 0;
        System.out.print("Period (years): ");
        years = scanner.nextByte();
        while (!((years>=1)&&(years<=30))){
            System.out.println("Enter a number between 1 and 30");
            System.out.print("Period (years): ");
            years = scanner.nextByte();
            }
        float interestRateDecimal = interestRate/100;
        double mortgage = (principal*(interestRateDecimal/12))/(1-Math.pow((1+(interestRateDecimal/12)),-(12*years)));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageCurrency = currency.format(mortgage);
        System.out.println("Mortgaga: "+ mortgageCurrency);
        }
    }

