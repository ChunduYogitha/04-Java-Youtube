import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        for(int i=0;i<4;i++){
            int num = 90;
            int a = 22;  // it is already intialised in the main method here shouldn't define again 
        }
        System.out.println(i); // It is printing out of the block
    }
}
// ERROR!
/tmp/X4xoIGfWBG/Main.java:9: error: variable a is already defined in method main(String[])
            int a = 22;
                ^
ERROR!
/tmp/X4xoIGfWBG/Main.java:11: error: cannot find symbol
        System.out.println(i);
                           ^
  symbol:   variable i
  location: class Main
2 errors

=== Code Exited With Errors ===
//
