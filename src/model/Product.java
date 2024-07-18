package model;

public class Product implements IProduct {
    private String name;
    private double price;
    private boolean isImported;
    private boolean isExempt;

    public Product(String name, double price, boolean isImported, boolean isExempt) {
        this.name = name;
        this.price = price;
        this.isImported = isImported;
        this.isExempt = isExempt;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isImported() {
        return isImported;
    }

    @Override
    public boolean isExempt() {
        return isExempt;
    }
}
