import java.util.Scanner;

public class nameNumber {

   public static String getPhoneNumber(String[] nameArr, String[] phoneNumberArr, String contactName, int arraySize){
      for(int i=0; i<arraySize; i++){
         if(nameArr[i].equals(contactName)){
            return phoneNumberArr[i];
         }
      }
      return "None";
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        //get the input from the user
        int n = sc.nextInt();
        String[] nameArr = new String[n];
        String[] phoneNumberArr = new String[n];
        for(int i = 0; i<n; i++) {
            String input[] = sc.next().split(",");
            nameArr[i] = input[0];
            phoneNumberArr[i] = input[1];
        }
        String contactName = sc.next();
        //call the getPhoneNumber() method
        System.out.println(getPhoneNumber(nameArr, phoneNumberArr, contactName, n));
        sc.close();
}
}
