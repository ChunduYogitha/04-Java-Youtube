import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        sum();
        sum();
        sum();
        }
        static void sum(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number 1 : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the number 2 : ");
            int num2 = sc.nextInt();
            int sum = num1+num2;
            System.out.println("The Sum = "+sum);
        }
}
/*
Enter the number 1 : 20
Enter the number 2 : 4
The Sum = 24
Enter the number 1 : 18
Enter the number 2 : 33
The Sum = 51
Enter the number 1 : 31
Enter the number 2 : 21
The Sum = 52
*/
