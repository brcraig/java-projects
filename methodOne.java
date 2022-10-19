public class methodOne{
  public static void main (String[] args){
    String words = "!This Message* Has Stuff @";
    System.out.println(clean(words));
  }
  public static String clean(String message){
    String cleanMessage = message.toLowerCase();
    String badChars = "@!&^%$#*()<>/|{}[]";
    for (char letter : badChars.toCharArray()){
      String stringVersion = String.valueOf(letter);
      cleanMessage = cleanMessage.replace(stringVersion, "");
    }
    return cleanMessage;
  }
}
