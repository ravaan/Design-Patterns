public class MahCafe {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();

        System.out.println(beverage1.getDescription() + " $" + String.format("%.2f", beverage1.cost()));

        System.out.println("MEDIUM Latte coming in...!");
        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.Size.MEDIUM);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost()));

        System.out.println("SMALL Latte coming in...!");
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.SMALL);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost()));

        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + String.format("%.2f", beverage1.cost()));
    }
}
