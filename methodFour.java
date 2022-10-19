import java.util.Random;
public class methodFour{
  public static void main (String[] args){
    System.out.println(isDead(100));

  }
  public static boolean isDead(int chanceOfDeath) {
      Random gen = new Random();
      int randomNumber = gen.nextInt(101);
      if (randomNumber == chanceOfDeath) {
          return true;
      }
      else {
          return false;
      }
  }
}
