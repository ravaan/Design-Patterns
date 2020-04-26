public class NoFly implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("I, sadly, cannot fly!");
    }
}
