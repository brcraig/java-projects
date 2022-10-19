/*
public: no access restrictions
static: dont need a calling object to use method
void: does not return anything
main: method name
*/
public class methodPractice{
  public static void main (String[] args){
    System.out.println("methods!");
    // invoke method
    int sum = add(10, 5);
    System.out.println(sum);
    String words = yell("i am yelling!");
  }
  /*
  add
  params: two integers
  return: single integer that is sum of two ints
  */
  public static int add( int n1, int n2){
    return n1 + n2; //output
  }
  public static void yell(String message){
    System.out.println(message.upper);
  }
}
