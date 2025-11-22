/*WAP to print N odd numbers.*/

import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<=50){
            if(i%2==1){
                System.out.println("Odd number : "+i);
            }
            i++;
        }
    }
}