import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the area");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the area");
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("Area :"+area);
        int result=area*5;
        System.out.println("Result : "+result);
    }
}