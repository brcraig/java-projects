public class Arrays {
  public static void main(String[] args){
    // if (args.length > 0){
    //   System.out.println("CLI arguments: " + args[0]);
    //   if (args[0].equals("special")){
    //     System.out.println("Starting up special program");
    //   }else{
    //     System.out.println("Starting up normal program");
    //   }
    // }
    // String[] movies = new String[5];
    // for (int i=0; i < movies.length; i++){
    //   System.out.println("i = " + i + " | " + movies[i]);

    // int[] votes = {10, 8, 9, 0, 0};
    // int totalVotes = 0;
    //
    // for (int v: votes){
    //   System.out.println("Vote: " + v);
    //   totalVotes += v;
    // }
    // //cannot natively loop through string objects, need to turn them into a char array
    // System.out.println("Votes casted: " + totalVotes);
    // String winner = "Birdman";
    // for (char l: winner.toCharArray()){
    //   String VOWELS = "AEIOUaeiou";
    //   if (VOWELS.indexOf(l) == -1){
    //     System.out.print(l);
    //   }
    // }
    /* 2 diemsional array stuff*/
    int SIZE = 5;
    char[][] checkerboard = new char[SIZE][SIZE];
    System.out.println(checkerboard);
    for (int row = 0; row < checkerboard.length; row++){
      for (int col = 0; col < checkerboard[row].length; col++){
        checkerboard[row][col] = 'X';
        System.out.print(" " + checkerboard[row][col] + " ");
      }
      System.out.print("\n");
    }
  }
}
