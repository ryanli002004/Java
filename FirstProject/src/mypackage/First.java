package mypackage;

import java.util.Date;
import java.util.Scanner;
import java.text.NumberFormat;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        //Date now = new Date();
        //System.out.println(now);

        //primative vs referance types:
        //Point point1 = new Point(1,2);
        //Point point2 = point1;
        //point1.x = 2;
        //System.out.println(point2);

        //strings:
        /*String message = "Hello World!!";
        Boolean seeif =  message.endsWith("!!");
        int numofm = message.length();
        System.out.println(seeif);
        System.out.println(numofm);*/

        /*String message = "Hello World";
        int checkIndex = message.indexOf("llo");
        System.out.println(checkIndex);
        String message2 = message.replace("H","W");
        System.out.println(message2);*/

        /*int[] myArray = {2,3,4,5,1,4};
        System.out.println(myArray.length);
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));*/

        /*int[][] numbers = {{1,2,3},{1,2,3}};
        System.out.println(Arrays.deepToString(numbers));*/

        //final float PI = 3.14F;

        //double result = (double)10 / 3;
        //System.out.println(result);
        
        /*int x = 1;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);*/

        /*int x = 1;
        short y = x + 2; // cant convert int to short you have tp go in order etc. short > int > double
        System.out.println(y);*/

        //String x = "1";
        //int y
        /*int [][] mylist = {{1,2,3}};
        System.out.println(Arrays.deepToString(mylist));
        long num = 2000000000;*/

        /*String x = "1.1";
        double y = Double.parseDouble(x) +2;
        System.out.println(y);*/

        /*int result = Math.max(2,1);
        System.out.println(result);
        double result1 = Math.random();
        System.out.println(result1);
        int result2 = (int)(Math.random()*100);
        System.out.println(result2);*/

        /*NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234.243);
        System.out.println(result);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.1);
        System.out.println(result1);*/

        //String percent = NumberFormat.getPercentInstance().format(0.01);
        //System.out.println(percent);
        Scanner scanner = new Scanner(System.in);
        System.out.print("age: ");
        byte age = scanner.nextByte();
        System.out.println("you are " + age);
    }
}
