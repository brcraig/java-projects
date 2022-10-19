import java.io.*;
import java.util.LinkedList;
public class BabyNames {
  public static void readFile(BufferedReader reader) throws IOException, ExplicitLanguageException {
      String currentLine;
      int nLines = 0;
      while((currentLine = reader.readLine()) != null){
          if (currentLine.contains("fuck") || currentLine.contains("shit")) {
              // we must create a new object of our custom exception with whatever error message we want
              // keyword "throw" says "hey, something is wrong! somebody else do something about it!"
              throw new ExplicitLanguageException("This file contains bad words.");
          }
          nLines++;
      }
      System.out.println("There are " + nLines + " lines in your file.");
  }
  public static void main (String[] args){
    /*
    Your task is to write a baby name generator program that takes in the name of a CSV file
    containing the potential baby names and the gender as command line arguments. (NOT a Scanner input from the terminal).
    Then, you should read in the file of baby names and randomly choose 3 names from the list
    for that gender and write those out to a new file called "potential_names.txt".
    To safeguard against malicious input, you should create a custom exception class called IncompatibleExtensionException that is
    thrown if the file entered as a command line argument does not end with ".csv". If this happens, tell the user your program only works with CSV files.
    */
    String fileName = args[0];
    BufferedReader reader = null;
    LinkedList<String> names = new LinkedList<String>();
    try {
        reader = new BufferedReader(new FileReader(fileName));
        String currentLine;
        while((currentLine = reader.readLine()) != null) {
            //System.out.println(currentLine.toUpperCase());
            names.add(currentLine);
        }
        System.out.println(names.get(4));
    } catch (FileNotFoundException e) {
        System.err.println("We couldn't find that file.");
    }
    catch (IOException e) {
        System.out.println("Error reading or writing to a file.");
        System.err.println(e.getMessage());
    }
    finally {
      try {
            if (reader != null) {
              reader.close();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
  }
