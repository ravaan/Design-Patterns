public class SoyDecorator extends ExtrasDecorator {
    Beverage beverage;

    public SoyDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        Size size = beverage.getSize();
        double cost = beverage.cost();
        switch (size) {
            case SMALL:
                cost += 0.10;
                System.out.println("Preparing SMALL");
                break;
            case MEDIUM:
                cost += 0.15;
                System.out.println("Preparing MEDIUM");
                break;
            case TALL:
                cost += 0.20;
                System.out.println("Preparing TALL");
                break;
            default:
                System.out.println("Wrong size selected! Please contact out executive right now and get discounts!!!");
        }
        return cost;
    }
}
