package mypackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class project1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double interestRatePercent = scanner.nextDouble();
        double interestRateDecimal = interestRatePercent/100;
        System.out.print("Period (Years): ");
        double years = scanner.nextDouble();
        double mortgage = (principal*(interestRateDecimal/12))/(1-Math.pow((1+(interestRateDecimal/12)),-(12*years)));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageCurrency = currency.format(mortgage);
        System.out.print("Mortgage: " + mortgageCurrency);

    }
}