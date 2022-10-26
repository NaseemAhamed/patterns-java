package decorator.starbuzz.condiments;

import decorator.starbuzz.beverages.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double beverageCost = beverage.cost();
        Size size=beverage.getSize();
        if (size == Size.SMALL) {
            beverageCost += 2;
        } else if (size == Size.MEDIUM) {
            beverageCost += 4;
        } else if (size == Size.LARGE) {
            beverageCost += 6;
        }
        return beverageCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip ";
    }
}
