package com.infogalaxy;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args){
        System.out.println("Welcome To Line Comparison Problem Developed By Sunil");
        //UC-1-Calculate Length
        Scanner sc = new Scanner(System.in);
        //UC-1-Calculate of Line1
        double x1 ;
        double y1 ;
        double x2 ;
        double y2 ;
        System.out.println("Enter the X1 coordinate");
        x1= sc.nextDouble();
        System.out.println("Enter the x2 coordinate");
        x2= sc.nextDouble();
        System.out.println("Enter the y1 coordinate");
        y1= sc.nextDouble();
        System.out.println("Enter the y2 coordinate");
        y2= sc.nextDouble();
        double length  ;

        length= Math.sqrt (Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Length="+length);


    }
}
