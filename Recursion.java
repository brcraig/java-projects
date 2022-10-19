/*
stack:
  -short term storage
  -last in, first out data type
  looks like:
  []
  []
  []
  -activation records:
    -hand bookkeeping for program
  -new activation record is created whenebr there is a method call
    -stores all paramaters and variables associated with method

heap:
  -long term storage
  -object reference
  looks like (blob):
  [] [] []
   [] [][] []
  []  [] [][]
*/
public class Recursion{
  public static void main(String[] arg){
    //hooray(2);
    System.out.println(addMeUp(4));
  }
  // private static void hooray(int n_hips){
  //   if(n_hips == 0){
  //     System.out.println("Hooray!");
  //   }else{
  //     System.out.print("Hip ");
  //     hooray(n_hips -1);
  //   }
  // }
  private static int addMeUp(int myNum){
    if(myNum == 0){
      //base case
      return myNum;
    }else{
      // recursive case
      return myNum + addMeUp(myNum -1);

    }
  }
}
