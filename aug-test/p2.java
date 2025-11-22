/*
Write a Java program to find the second largest number in an array.

Example Input: {10, 5, 20, 8, 25, 3}
*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int t=sc.nextInt();
        System.out.println("Enter the element of the array");
        int arr[]=new int[t];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are...");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int max=0;
        int temp;
        for(int i=0;i<=arr.length-1;i++){
           if(arr[0]>arr[i]){
            System.out.println(arr[0]);
           }
        }
    }
}