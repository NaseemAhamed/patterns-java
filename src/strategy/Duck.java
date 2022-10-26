package strategy;

import strategy.fly.FlyBehaviour;
import strategy.quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehavior;

    public Duck() {
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour=fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehavior=qb;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
