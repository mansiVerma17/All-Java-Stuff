/*3) WAP to find out the sum of N natural number.*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=num){
            sum=sum+i;
            i++;
        }
            System.out.println("Sum of the natural number is : "+sum);

    }
}