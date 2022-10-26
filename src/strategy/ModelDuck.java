package strategy;

import strategy.fly.FlyNoWay;
import strategy.quack.Quack;

public class ModelDuck extends Duck{
    ModelDuck(){
        flyBehaviour=new FlyNoWay();
        quackBehavior=new Quack();
    }

    public void display(){
        System.out.println("I am a model duck");
    }
}
