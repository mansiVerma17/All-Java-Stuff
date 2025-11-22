/*…... -6	-3	0	3	6	9	……. n terms	 */
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to start the series...");
        int num=sc.nextInt()*(-1);
        System.out.println("Enter the number to stop the series...");
        int num1=sc.nextInt();
        while(num<=num1){
        if(num%3==0){
            System.out.print("\t"+num);
        }
        num++;
        }
    }
}