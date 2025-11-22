//1 2	2	4	8	32	…… n terms
import java.util.Scanner;
class Data{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int sq=1;
    int num=1;
    while(num<=n){
        System.out.println(sq);
        sq=sq*2;
        num++;
    }
}
}
