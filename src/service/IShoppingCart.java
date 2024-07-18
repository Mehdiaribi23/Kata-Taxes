package service;

import model.IProduct;
import java.util.List;

public interface IShoppingCart {
    void addProduct(IProduct product);
    void printReceipt();
    List<IProduct> getProducts();
}
