1)Printing values using VarArgs
2)Multiple mutiple datas using VarAgrs 

-------------------------------------------------------------------
1)Printing values using VarArgs
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        fun(1,2,3,4,5,65);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
OUTPUT
[1, 2, 3, 4, 5, 65]
---------------------------------------------------------------------
2)Multiple mutiple datas using VarAgrs 
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        multiple(1,2,"Java","Python");
    }
    static void multiple(int a, int b, String...v){
        
    }
}
