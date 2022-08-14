package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    public static int X1_LINE1;
    public static int Y1_LINE1;
    public static int X2_LINE1;
    public static int Y2_LINE1;
    public static double LENGTH_LINE1;
    public static int X1_LINE2;
    public static int Y1_LINE2;
    public static int X2_LINE2;
    public static int Y2_LINE2;
    public static double LENGTH_LINE2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("Enter Coordinates of first line");
        System.out.println("Enter X Coordinates of First Point");
        X1_LINE1 = scan.nextInt();
        System.out.println("Enter Y Coordinates of First Point");
        Y1_LINE1 = scan.nextInt();
        System.out.println("Enter X Coordinates of Second Point");
        X2_LINE1 = scan.nextInt();
        System.out.println("Enter Y Coordinates of Second Point");
        Y2_LINE1 = scan.nextInt();
        LENGTH_LINE1 = getLength(X1_LINE1,Y1_LINE1,X2_LINE1,Y2_LINE1);

        System.out.println("Enter Coordinates of Second line");
        System.out.println("Enter X Coordinates of First Point");
        X1_LINE2 = scan.nextInt();
        System.out.println("Enter Y Coordinates of First Point");
        Y1_LINE2 = scan.nextInt();
        System.out.println("Enter X Coordinates of Second Point");
        X2_LINE2 = scan.nextInt();
        System.out.println("Enter Y Coordinates of Second Point");
        Y2_LINE2 = scan.nextInt();
        LENGTH_LINE2 = getLength(X1_LINE2,Y1_LINE2,X2_LINE2,Y2_LINE2);
        equals(LENGTH_LINE1,LENGTH_LINE2);

    }

    static void equals(double line1,double line2){
        if(line1 == line2)
            System.out.println("line 1 and line2 two are equal");
        else
            System.out.println("line 1 and line2 two are not equal");
    }

    public static double getLength(int x1, int y1,int x2,int y2) {
        double length;
        length = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return length;
    }
}
