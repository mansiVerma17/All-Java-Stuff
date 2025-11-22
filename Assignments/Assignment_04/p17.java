/*1 	2	 4	 7	 11	 16 	…… n terms*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to stop the series...");
        int num=sc.nextInt();
        int t=1;
        int n=1;
        while(n<=num){
           System.out.println(t);
            t=t+n;

        n++;
    }
}
}