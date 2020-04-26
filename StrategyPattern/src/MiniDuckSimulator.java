public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck exotic = new ExoticDuck();
        exotic.performFly();
        exotic.performQuack();
        exotic.display();
        exotic.setFlyStrategy(new NormalFly());
        exotic.performFly();
    }
}
