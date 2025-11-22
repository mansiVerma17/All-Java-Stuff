/*6) WAP to find out the factors of a number.*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int f=0;
        System.out.println("Enter the number ");
        int num =sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
            //    f++;
            System.out.println(i);
            }
        }
        // System.out.println("total factor ="+f);
}
}