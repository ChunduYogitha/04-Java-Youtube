SCOPE : Scope means we can access the variables inside the functions
public class Scope{
  public static void main(String[] args){
    int a = 10;
    int b = 20;
  }
  static void random(){
    System.out.println(a);
  }
}
// ERROR!
/tmp/KUXW1Aptl7/Scope.java:7: error: cannot find symbol
    System.out.println(a);
                       ^
  symbol:   variable a
  location: class Scope
1 error

=== Code Exited With Errors === //

                                                                  OR

  public class Scope{
  public static void main(String[] args){
    int a = 10;
    int b = 20;
    System.out.println(num);
  }
  static void random(){
      int num = 67;
    
  }
}
// ERROR!
/tmp/o5ie3aAFnp/Scope.java:5: error: cannot find symbol
    System.out.println(num);
                       ^
  symbol:   variable num
  location: class Scope
1 error

=== Code Exited With Errors ===

//
  
