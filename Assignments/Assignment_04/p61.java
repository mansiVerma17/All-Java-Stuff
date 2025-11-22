/*WAP to find out all the leap years between two entered years*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        System.out.println("Enter the year");
        int year1=sc.nextInt();
        while(year<=year1){
            if(year%4==0 ||year%100==0 && year%400==0){
                System.out.println(year+" is a leap year");
            }
            else{
                System.out.println(year+" is not  a leap year");

            }
            year++;
        }
    }
}