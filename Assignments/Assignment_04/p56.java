//WAP to print factorial of all the numbers between two entered numbers
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter a number");
        int n1=sc.nextInt();
        int mul=1;
        for(int i=n;i<=n1;i++){
           while(i>=1){
            mul=mul*i;
           }
            System.out.println("Factorial :"+mul);
        }


    }
}