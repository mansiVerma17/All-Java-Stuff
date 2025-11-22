/*1	11	111	1111	  11111	……*/
import java.util.Scanner;
class Data{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int sum =1;
    int s=0;
    int j=1;
    for(int i=1;i<=num;i++){
        sum=sum*10+1;
        System.out.println(sum);
        s=s+sum;
    }
    System.out.println(s);
}
}