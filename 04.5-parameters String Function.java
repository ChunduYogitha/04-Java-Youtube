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

