package decorator.starbuzz.condiments;

import decorator.starbuzz.beverages.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
