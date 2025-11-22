/*WAP to print Even numbers upto N.*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the number");
        int num1=sc.nextInt();
        while(num<=num1){
            if(num%2==0){
                System.out.println("Even number : "+num);
            }
            num++;
        }
    }
}