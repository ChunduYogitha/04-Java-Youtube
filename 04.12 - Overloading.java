1) Using same method name with different arguments
2) Using Same method name and same arguments 
 3) Method overloading with VarArgs
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
---------------------------------------------------------------------------

3) Method overloading with VarArgs
 import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
    demo(1,2,5,8,99);
    demo("Java","Py");
    }
    static void demo(int... v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String... v){
        System.out.println(Arrays.toString(v));
    }
}
//
[1,2,5,99]
 [Java , Py]
 //
