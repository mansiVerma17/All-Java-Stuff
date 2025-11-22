/*WAP to print Square, Cube and Square Root of all numbers from 1 to N*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=sc.nextInt();
        int num1=1;
        while(num1<=num){
            int square=num1*num1;
            int cube=num1*num1*num1;
            double root=Math.sqrt(num1);
            System.out.println("Square of the "+num1+ " is : "+square);
            System.out.println("Cube of the "+num1+ " is : "+cube);
            System.out.println("Square root of the "+num1+ " is : "+root);
            num1++;
        }
    }
}