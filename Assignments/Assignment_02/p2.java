/*
The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter. 
*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of  the area...");
        int area=sc.nextInt();

        System.out.println("Enter the value of breadth...");
        int breadth=sc.nextInt();
        
        int length=area-breadth;
        System.out.println("Length of area of rectangle is :"+length);
        int perimeter=2*(length+breadth);
        System.out.println("Perimetr of the rectangle is :"+perimeter);
        
    }
}