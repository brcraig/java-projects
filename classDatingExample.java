public class classDatingExample{
public static void main(String[] args){
  Profile person1 = new Profle ("Will Smith");
  Profile person2 = new Profile("Jada Smith");

  person1.swipeRight(person2);
  for(Profile p : person2.getMatches()){
    System.out.println(p);
  }
}}
