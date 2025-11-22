/*4) WAP to print table of a number.*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the number");
        int num1=sc.nextInt();
        int i=1;
        while(i<=num1){
            System.out.println(num +" X "+ i + " = "+num*i);
            i++;
        }
    }
}