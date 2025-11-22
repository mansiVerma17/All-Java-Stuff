/*9	25	49	81	…..*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            if(i%2==1){
                System.out.println(i);
                int square=i*i;
                System.out.println("\t"+square);
              
            }
            i++;
        }
    }
}