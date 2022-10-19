import java.util.Scanner;

public class LabProgram {

   public static int[] getUserValues(int[] myArr, int arrSize, Scanner scnr){
      //scnr = new Scanner(System.in);
      for(int i = 0; i<arrSize; i++){
         myArr[i] = scnr.nextInt();
      }
      return myArr;

   }
   public static int intsLessThanOrEqualToThreshold(int[] userValues, int userValsSize, int upperThreshold, int[] resValues){
      int valuesLength = 0;
      for(int i = 0; i<userValsSize; ++i){
          if(resValues[i] <= upperThreshold){
            valuesLength += 1;
         }
      }
      return valuesLength;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];
      int[] resValues = new int[20];
      int upperThreshold;
      int numInVals;
      int numResVals;
      int i;

      numInVals = scnr.nextInt();
      int[] values = getUserValues(userValues, numInVals, scnr);
      for(int h=0;h<values.length;h++){
        System.out.println(values[h]);
      }
      upperThreshold = scnr.nextInt();
      numResVals = intsLessThanOrEqualToThreshold(userValues, numInVals, upperThreshold, resValues);

      for (i = 0; i < numResVals; ++i) {
         System.out.print(resValues[i] + " ");
      }
      System.out.println();
   }
}
