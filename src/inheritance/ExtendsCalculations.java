package inheritance;

public class ExtendsCalculations extends Calculations {
    ExtendsCalculations() {
        System.out.print("extendwow");
    }

//  multuply
    public int multiplications(int first, int second){
        int result = first * second;
        return result;
    }
}
