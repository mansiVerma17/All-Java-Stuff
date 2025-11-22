/*WAP to print alphabets in uppercase*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the alphabet letter");
        char letter=sc.next().toUpperCase().charAt(0);
        System.out.println("Alphabet letter : "+letter);
        
    }
}