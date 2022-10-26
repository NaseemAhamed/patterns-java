package decorator.starbuzz.condiments;

import decorator.starbuzz.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        double beverageCost = beverage.cost();
        Size size = beverage.getSize();
        if (size == Size.SMALL) {
            beverageCost += 2;
        } else if (size == Size.MEDIUM) {
            beverageCost += 4;
        } else if (size == Size.LARGE) {
            beverageCost += 6;
        }
        return beverageCost;
    }
}
