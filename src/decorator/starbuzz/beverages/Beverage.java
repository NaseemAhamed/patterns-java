package decorator.starbuzz.beverages;

public abstract class Beverage {
    protected String description = "Unknown beverage";

    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }

    Size size = Size.MEDIUM;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }
}
