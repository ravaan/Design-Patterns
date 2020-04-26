public class MuteQuack implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println("This is no quacking also known as Mute Quack");
    }
}
