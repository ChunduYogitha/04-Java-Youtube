public class Scope{
  public static void main(String[] args){
    int a = 10;
    int b = 20;
  }
  {
      a = 3; //it already intialised outside the block in the same method , hence you cannot intialise again, but can change the value.
      int c = 99;
    // value intialised in this block will remain in block.
  }
  System.out.println(c);  // cannot use outsidethe block.
}
// ERROR!
/tmp/ouHh7ymGgR/Scope.java:10: error: <identifier> expected
  System.out.println(c);
                    ^
ERROR!
/tmp/ouHh7ymGgR/Scope.java:10: error: <identifier> expected
  System.out.println(c);
                      ^
2 errors

=== Code Exited With Errors ===
//
