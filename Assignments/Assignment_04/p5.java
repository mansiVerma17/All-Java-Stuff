/*5) WAP to find out the factorial of a number.*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int mul=1;
        while(num>=1){
            mul=mul*num;
            num--;
        }
            System.out.println(mul);

    }
}