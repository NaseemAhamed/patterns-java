package decorator.starbuzz.beverages;

public class Decaf extends Beverage{
    Decaf(){
        description="Decaf";
    }
    public double cost(){
        return 1;
    }
}
