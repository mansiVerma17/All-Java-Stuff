//9	99	999	9999	  99999 …….
import java.util.Scanner;
class Data{
    public static void main(String arsg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=9;
        for(int i=1;i<=num;i++){
            System.out.println(sum);

            sum=sum*10+9;
        }
    }
}