/*WAP to print N even numbers.*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<=50){
            if(i%2==0){
                System.out.println("Even number : "+i);
            }
            i++;
        }
    }
}