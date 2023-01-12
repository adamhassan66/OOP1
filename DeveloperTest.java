import java.util.ArrayList;

public class DeveloperTest{
  public static void main(String[]args){
    System.out.println("----Developer Test----");
    Developer dev1 = new Developer();
    dev1.name = "pepper";
    dev1.languages = new ArrayList<String>();
    dev1.languages.add("java");

    System.out.println(dev1.name);
    System.out.println(dev1.languages);
  }
}