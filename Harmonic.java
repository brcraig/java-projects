public class Harmonic{
  public static void main (String[] args){
    System.out.println(calcIterativeHarmonic(20));
    System.out.println(calcRecursiveHarmonic(20));
  }
  public static double calcIterativeHarmonic(int n){
    double sum = 0;
    for(int i=n; i>0;i--){
      sum += (double)1/i;
    }
    return sum;
  }
  public static double calcRecursiveHarmonic(int n){
    if(n == 0){
      return 0;
    }else{
      return (double)1/n+calcRecursiveHarmonic(n-1);
    }
  }
}
