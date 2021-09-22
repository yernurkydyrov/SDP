package com;

public abstract class Swim {
    private SwimStrategy swimStrategy;

    public Swim(SwimStrategy swimStrategy) {
        setSwimStrategy(swimStrategy);
    }

    public void performSwim() {
        swimStrategy.swim();

    }

    abstract void display();

    public SwimStrategy getSwimStrategy() {
        return swimStrategy;
    }

    public void setSwimStrategy(SwimStrategy swimStrategy) {
        this.swimStrategy = swimStrategy;
    }
}
