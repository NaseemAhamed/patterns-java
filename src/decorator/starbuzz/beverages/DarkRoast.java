package decorator.starbuzz.beverages;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Dark Roast";
    }
    public double cost(){
        return 1;
    }
}
