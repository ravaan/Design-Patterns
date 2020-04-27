public abstract class Beverage {
    private Size size = Size.TALL;

    public Size getSize() {
        return size;
    }
    String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public enum Size {TALL, MEDIUM, SMALL}

    public abstract double cost();
}
