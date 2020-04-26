public abstract class Duck {
    FlyStrategy flyStrategy;
    QuackStrategy quackStrategy;

//    public Duck(FlyStrategy flyStrategy, QuackStrategy quackStrategy) {
//        this.flyStrategy = flyStrategy;
//        this.quackStrategy = quackStrategy;
//    }


    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setQuackStrategy(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    public abstract void display();

    public void performFly() {
        flyStrategy.fly();
    }

    public void performQuack() {
        quackStrategy.quack();
    }

    public void swim() {
        System.out.println("All ducks can swim, even if they are made of plastic!");
    }
}
