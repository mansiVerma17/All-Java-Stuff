import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to start the table...");
        int num=sc.nextInt();
        System.out.println("Enter the number");
        int num1=sc.nextInt();
       
        while(num<num1){
            
             for(int i=1;i<=10;i++){
                // int n=i*num;
            System.out.println(i*num);

             }
        }
        num++;

    }
}