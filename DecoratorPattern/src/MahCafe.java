public class MahCafe {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();

        System.out.println(beverage1.getDescription() + " $" + String.format("%.2f", beverage1.cost()));

        System.out.println("MEDIUM Latte coming in...!");
        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.Size.MEDIUM);
        beverage2 = new SoyDecorator(beverage2);
        beverage2 = new MochaDecorator(beverage2);
        beverage2 = new MochaDecorator(beverage2);
        beverage2 = new WhipDecorator(beverage2);
        System.out.println(beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost()));

        System.out.println("SMALL Latte coming in...!");
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.SMALL);
        beverage3 = new SoyDecorator(beverage3);
        beverage3 = new MochaDecorator(beverage3);
        beverage3 = new MochaDecorator(beverage3);
        beverage3 = new WhipDecorator(beverage3);
        System.out.println(beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost()));

        beverage1 = new WhipDecorator(beverage1);
        System.out.println(beverage1.getDescription() + " $" + String.format("%.2f", beverage1.cost()));
    }
}
