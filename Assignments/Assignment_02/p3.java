/*
How many tiles whose length and breadth are 13 cm and 7cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140cm ?
*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the tiles length...");
        int tiles_length=sc.nextInt();

        System.out.println("Enter the value of the tiles breadth...");
        int tiles_breadth=sc.nextInt();
        
        System.out.println("Enter the value of the region length...");
        int region_length=sc.nextInt();

        System.out.println("Enter the value of the region breadth...");
        int region_breadth=sc.nextInt();
        
        int area1=tiles_length*tiles_breadth;
        int area2=region_length*region_breadth;
        int result=area2/area1;
        System.out.println("Area of the one tile is :"+area1);
        System.out.println("Area of the room is :"+area2);
        System.out.println("Result is :"+result);
        


    }
}