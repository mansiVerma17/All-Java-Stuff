/*
Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m. 
*/ 
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of the length...");
        int length=sc.nextInt();

        System.out.println("enter the value of the width...");
        int width=sc.nextInt();

        System.out.println("enter the value of the rate...");
        int rate=sc.nextInt();

        int area =length*width;
        System.out.println("Area of the rectnagular plot is :"+area);
        //cost of 100m square is 6$

        int hundred_square=area/100;
        System.out.println("Area of the hundred square meter is:"+hundred_square);
        int cost=hundred_square*rate;
        System.out.println("Total cost of the tile of the rectangular plot is:"+cost);
        
    }
}