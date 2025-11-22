/*1) WAP to print a statement 1000 number of times.*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=sc.nextInt();
        while(num<=1000){
            System.out.println("Nature Beauty...");
            num++;

        }
    }
}