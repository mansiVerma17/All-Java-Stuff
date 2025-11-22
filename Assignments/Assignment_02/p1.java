/*
The perimeter of a rectangle is 230 cm.If the length of the rectangle is 70cm, find its breadth and area.
*/
import java.util.Scanner;
class Data{
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of perimeter...");
		int perimeter=sc.nextInt();

        System.out.println("Enter the value of length...");
		int length=sc.nextInt();

		int breadth=(perimeter-2*length)/2;

		System.out.println("Breadth of the rectangle is :"+breadth);
		int area= length*breadth ;
		System.out.println("Area of the rectangle is :"+area);
}

}