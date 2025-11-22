//WAP to print all the prime numbers between two entered numbers
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the number ");
        int n1=sc.nextInt();
        for(int i=n;i<=n1;i++){
            if(i%n==0){
                System.out.println(i);
            }
        }
    }
}