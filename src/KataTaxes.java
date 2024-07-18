import model.Product;
import service.ShoppingCart;

public class KataTaxes {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addProduct(new Product("livre ", 12.49, false, true));
        cart1.addProduct(new Product("CD musical", 14.99, false, false));
        cart1.addProduct(new Product("barre de chocolat", 0.85, false, true));

        ShoppingCart cart2 = new ShoppingCart();
        cart2.addProduct(new Product("boîte de chocolats importée", 10.00, true, true));
        cart2.addProduct(new Product("flacon de parfum importé", 47.50, true, false));

        ShoppingCart cart3 = new ShoppingCart();
        cart3.addProduct(new Product("flacon de parfum importé", 27.99, true, false));
        cart3.addProduct(new Product("flacon de parfum", 18.99, false, false));
        cart3.addProduct(new Product("boîte de pilules contre la migraine", 9.75, false, true));
        cart3.addProduct(new Product("boîte de chocolats importés", 11.25, true, true));

        System.out.println("Output 1:");
        cart1.printReceipt();

        System.out.println("\nOutput 2:");
        cart2.printReceipt();

        System.out.println("\nOutput 3:");
        cart3.printReceipt();
    }
}
