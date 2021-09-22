package com;

public abstract class Air {
    private FlyStrategy flyStrategy;

    public Air(FlyStrategy flyStrategy) {
        setFlyStrategy(flyStrategy);
    }

    public void performAir() {
        flyStrategy.fly();
    }

    abstract void display();

    public FlyStrategy getFlyStrategy() {
        return flyStrategy;
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }
}
