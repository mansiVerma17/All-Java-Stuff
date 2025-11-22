/*8	27	64	125	…..*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            int c=i*i*i;
            System.out.println("\t"+c);
            i++;
        }
    }
}