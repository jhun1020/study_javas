package inheritance;

public class Calculations extends Object{
    int _first = 0;
    int _second = 0;
    // Constructor
    Calculations(){

        System.out.print("Calculations - constructor");
    }
    Calculations(int first, int second){
        this._first = first;
        this._second = second;
    System.out.print("Calculations - constructor");
    }
    
    //multiplication
    public int multiplication(){
        int result = this._first * this._second;
        return result;
    }

    // Public Method addition
    public int addition(int first, int second){
       int  result = first + second;
        return result;
    }

    // Public Method substraction
    public int substraction(int first, int second){
        int result = first - second;
        return result;
    }
}
