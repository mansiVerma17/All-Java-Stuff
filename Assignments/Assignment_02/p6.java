/*Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();

        System.out.println("Enter the value of b");
        int b=sc.nextInt();

        System.out.println("entr the value of the perimeter..");
        int perimeter=sc.nextInt();

        int c=perimeter-a-b;
        System.out.println("Third value of the perimeter triangle is:"+c);
        int semiPerimeter=(a+b+c)/2;
        System.out .println("Semi perimeter of the triangle is:"+semiPerimeter);

        double result=Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
        System.out.println("Result is :"+result);
    }
}