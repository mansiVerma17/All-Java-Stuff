//1	27	125	343	…………
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==1){
                int num=i*i*i;
            System.out.print("\t"+num);

            }
        }
    }
}