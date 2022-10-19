import java.lang.Math;
import java.util.Scanner;
public class conditionals {
  public static void main(String[] args) {
    // int visitors = 0;
    // System.out.println("New visitor!");
    // System.out.println("There are now " + ++visitors + " on your site.");
    // System.out.println(visitors);
    //
    // int colors = 3;
    // int shapes = 2;
    // int combinations = (int)Math.pow(shapes, colors);
    // System.out.println(combinations);
    // float percentChange = (float) -4.5;
    // System.out.println(Math.abs(percentChange));
    //
    // Scanner userInput = new Scanner(System.in);
    // System.out.println("Enter your favorite dog: ");
    // String favoriteDog = userInput.nextLine();
    // System.out.println("Your favorite dog is a " + favoriteDog);
    // System.out.println("Enter your favorite number: ");
    // int favoriteNumber = userInput.nextInt();
    // System.out.println("Your favorite number is " + favoriteNumber);
    // userInput.nextLine(); //acts as buffer
    // System.out.println("What is your favorite city? ");
    // String favoriteCity = userInput.nextLine();
    // System.out.println("Your favorite city is " + favoriteCity);

    String LUCKY_WORD = "wordy";
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter your guess: ");
    String guess = userInput.nextLine();
    // if (guess > LUCKY_NUMBER) {
    //   System.out.println("You overshot");
    // } else if (guess < LUCKY_NUMBER){
    //   System.out.println("You undershot");
    // } else {
    //   System.out.println("You got it!");
    // }
    // you can't compare two object with ==, only primative types
    if (guess.equals(LUCKY_WORD)){
      System.out.println("You guessed it!");
    }

  }
}
