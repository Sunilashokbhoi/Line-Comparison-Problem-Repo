package com.infogalaxy;
import java.util.Scanner;
public class LineComparison {
    public static void  equals(double lengthofline1 , double lengthofline2){
        if(lengthofline1 == lengthofline2){
            System.out.println("Both Lines Are Same");
        } else{
            System.out.println("Lines Are No Same");

            //UC-3-Length Of Two Lines Are Compare
            if(lengthofline1 > lengthofline2){
                System.out.println("Length Of Line 1 Is Greater");
            } else{
                System.out.println("Length Of Line 2 Is Greater");
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Welcome To Line Comparison Problem Developed By Sunil");
        //UC-1-Calculate Length
        Scanner sc = new Scanner(System.in);
        //UC-1-Length of Line1
        double x1 ;
        double y1 ;
        double x2 ;
        double y2 ;
        //UC-2-Length of Line 2
        double a1;
        double a2;
        double b1;
        double b2;

        System.out.println("Enter the X1 coordinate");
        x1= sc.nextDouble();
        System.out.println("Enter the x2 coordinate");
        x2= sc.nextDouble();
        System.out.println("Enter the y1 coordinate");
        y1= sc.nextDouble();
        System.out.println("Enter the y2 coordinate");
        y2= sc.nextDouble();
        double lengthofline1  ;

        lengthofline1= Math.sqrt (Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Length="+lengthofline1);

        System.out.println("Enter A1:  ");
        a1= sc.nextDouble();
        System.out.println("Enter A2 : ");
        a2=sc.nextDouble();
        System.out.println("Enter B1 : ");
        b1=sc.nextDouble();
        System.out.println("Enter B2 : ");
        b2=sc.nextDouble();
        double lengthofline2 = Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1),2));
        System.out.println("Length2 = "+lengthofline2);
        equals(lengthofline1 , lengthofline2);

    }
}
