public class ExoticDuck extends Duck {
    public ExoticDuck() {
        quackStrategy = new Quack();
        flyStrategy = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I am a very exotic duck, I can Quack but cannot fly, exotic shit.");
    }
}
