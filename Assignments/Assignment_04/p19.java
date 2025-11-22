//1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double sum=0;
        System.out.println("Entr the number");
        double n2=sc.nextInt();
        for(double i=1;i<=n2;i++){
         
            double m=1/i;
            System.out.print(m+" \t");
            sum=sum+m;

        }
        System.out.println();
            System.out.println("Sum of the series is : "+sum);
    }
}