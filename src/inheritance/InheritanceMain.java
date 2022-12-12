package inheritance;

public class InheritanceMain {
public static void main(String[] args) {
    // InheritanceObject inheritanceObject = new InheritanceObject();
    Calculations calculations = new Calculations();
    Calculations calculationsWithParams = new Calculations(6, 7);
    ExtendsCalculations extendsCalculations = new ExtendsCalculations();
    System.out.println("Done");
}
}