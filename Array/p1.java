import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int arr[][]=new int [3][3];
        int arr[][]={
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        for(int a[]:arr){
            for(int b:a){
                System.out.print(" "+b);
            }
            System.out.println();
        }
    }
}