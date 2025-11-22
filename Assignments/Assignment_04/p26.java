/*0	8	64	216	…………*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i=2;
        while(i<=num){
            if(i%2==0){
                System.out.println(i);
                int cube=i*i*i;
                System.out.println("\t"+cube);;
            }
            i++;
        }        
    }
}