import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr = {2,4,5,85,1};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0] = 6;
    }
}
/*
[6, 4, 5, 85, 1]
*/
