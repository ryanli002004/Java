package mypackage;

import java.util.Date;
import java.util.Scanner;
import java.text.NumberFormat;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Date now = new Date();
        System.out.println(now);

        //primative vs referance types:
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = "Hello World!!";
        Boolean seeif =  message.endsWith("!!");
        int numofm = message.length();
        System.out.println(seeif);
        System.out.println(numofm);

        String message1 = "Hello World";
        int checkIndex = message1.indexOf("llo");
        System.out.println(checkIndex);
        String message2 = message1.replace("H","W");
        System.out.println(message2);

        int[] myArray = {2,3,4,5,1,4};
        System.out.println(myArray.length);
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));

        int[][] numbers = {{1,2,3},{1,2,3}};
        System.out.println(Arrays.deepToString(numbers));

        final float PI = 3.14F;

        double result = (double)10 / 3;
        System.out.println(result);
        
        int x = 1;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);

        int x1 = 1;
        long y1 = x1 + 2; // cant convert int to short you have tp go in order etc. short > int > double
        System.out.println(y);

        String x2 = "1";
        int y2;
        int [][] mylist = {{1,2,3}};
        System.out.println(Arrays.deepToString(mylist));
        long num = 2000000000;

        String x3 = "1.1";
        double y3 = Double.parseDouble(x3) +2;
        System.out.println(y3);

        int result1 = Math.max(2,1);
        System.out.println(result1);
        double result2 = Math.random();
        System.out.println(result2);
        int result3 = (int)(Math.random()*100);
        System.out.println(result3);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result4 = currency.format(1234.243);
        System.out.println(result4);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result5 = percent.format(0.1);
        System.out.println(result5);

        String percent1 = NumberFormat.getPercentInstance().format(0.01);
        System.out.println(percent1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = scanner.nextLine().trim();
        System.out.println("you are " + name);
    }
}
