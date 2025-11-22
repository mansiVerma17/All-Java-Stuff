/*0	7	14	21	28	35	…..*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to stop the series...");
        int num=sc.nextInt();
        int num1=7;
        while(num1<=num){
            System.out.println("\t"+num1);
            num1+=7;
        }
    }
}