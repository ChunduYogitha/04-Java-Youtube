1) Using same method name with different arguments
2) Using Same method name and same arguments 
---------------------------------------------------------------------------
 1) Using same method name with different arguments 
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
    num(67);
    num("Java");
    }
    static void num(int a){
        System.out.println(a);
        
    }
    static void num(String name){
        System.out.println(name);
    }
}
//
  67
  Java
//

    ---------------------------------------------------------------------------

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
    int ans = num(2,4,5);
    System.out.println(ans);
    }
    static int num(int a, int b){
        return a + b;
    }
    static int num(int a, int b, int c){
        return a + b + c;
    }
}
