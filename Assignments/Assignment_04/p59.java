/*WAP to find out the sum of all integer between 100 and 200 which are divisible by 9*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=100;
        int sum=0;
        while(i<=200){
            if(i%9==0){
             sum=sum+i;
             System.out.println("Sum of the number that are divisible by 9 : "+sum);
             
            }
            else{
                System.out.println("this no. is not divisible by 9");
            }
            
            i++;
        }
    }
}