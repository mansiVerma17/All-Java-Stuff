/*WAP to print Fibonacci series.*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int i=0;
        int c=0;
        while(i<=num){
            a=b;
            b=c;
            c=a+b;
            System.out.println("Fibonacci series is : "+c);

            i++;
        }
    }
}