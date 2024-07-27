import java.io.*;
public class Main{
    public static void main(String[] args){
        String msg = greet("Yogitha");
        System.out.println(msg);
    }
    static String greet(String name){
        String message = "Hello " + name;
        return message;
    }
}
/*
  Hello Yogitha
*/

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        String text = greet(name);
        System.out.println(text);
    }
    static String greet(String name){
        String message = "Hello " + name;
        return message;
    }
}
/*
Enter your name : Yogitha
Hello Yogitha
*/
