package service;

import model.IProduct;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements IShoppingCart {
    private List<IProduct> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(IProduct product) {
        products.add(product);
    }

    private double roundTax(double tax) {
        return Math.ceil(tax * 20.0) / 20.0;
    }

    @Override
    public void printReceipt() {
        double totalTax = 0.0;
        double totalPrice = 0.0;

        for (IProduct product : products) {
            double tax = 0.0;

            if (!product.isExempt()) {
                tax += product.getPrice() * 0.10;
            }

            if (product.isImported()) {
                tax += product.getPrice() * 0.05;
            }

            tax = roundTax(tax);
            double totalProductPrice = product.getPrice() + tax;
            totalTax += tax;
            totalPrice += totalProductPrice;

            System.out.println(product.getName() + " : " + String.format("%.2f", totalProductPrice));
        }

        System.out.println("Montant des taxes : " + String.format("%.2f", totalTax));
        System.out.println("Total : " + String.format("%.2f", totalPrice));
    }

    @Override
    public List<IProduct> getProducts() {
        return products;
    }
}
