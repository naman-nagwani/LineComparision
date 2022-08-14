package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    public static int X1;
    public static int Y1;
    public static int X2;
    public static int Y2;
    public static double length;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("Enter X Coordinates of First Point");
        X1 = scan.nextInt();
        System.out.println("Enter Y Coordinates of First Point");
        Y1 = scan.nextInt();
        System.out.println("Enter X Coordinates of Second Point");
        X2 = scan.nextInt();
        System.out.println("Enter Y Coordinates of Second Point");
        Y2 = scan.nextInt();
        length = getLength(X1,Y1,X2,Y2);
        System.out.println("Length of the line is : "+length);
    }

    public static double getLength(int x1, int y1,int x2,int y2) {
        double length;
        length = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return length;
    }
}
