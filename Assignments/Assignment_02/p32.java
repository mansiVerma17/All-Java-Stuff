
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the side");
        int side1=sc.nextInt();
        System.out.println("Enter the value of the  other side");
        int side2=sc.nextInt();
        int area1=side1*side1;
        int area2=side2*side2;
        System.out.println("Area of the garden with th pool is:"+area1);
        System.out.println("Area of the pool is :"+area2);
        int result=area1-area2;
        System.out.println("Area of the garden is :"+result);
    }
}