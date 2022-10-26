package decorator.starbuzz;

import decorator.starbuzz.beverages.Beverage;
import decorator.starbuzz.beverages.DarkRoast;
import decorator.starbuzz.beverages.Espresso;
import decorator.starbuzz.beverages.HouseBlend;
import decorator.starbuzz.condiments.Mocha;
import decorator.starbuzz.condiments.Soy;
import decorator.starbuzz.condiments.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        printBeverage(beverage);

        Beverage beverage1=new DarkRoast();
        beverage1.setSize(Beverage.Size.LARGE);
        beverage1=new Mocha(beverage1);
        beverage1=new Mocha(beverage1);
        beverage1=new Whip(beverage1);
        printBeverage(beverage1);

        Beverage beverage2=new HouseBlend();
        beverage2=new Soy(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        printBeverage(beverage2);
    }

    static void printBeverage(Beverage beverage) {
        System.out.println("Beverage description " + beverage.getDescription() + " ; " + "Beverage cost " + beverage.cost());
    }
}
