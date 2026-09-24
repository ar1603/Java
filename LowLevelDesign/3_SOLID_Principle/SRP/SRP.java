// S - SRP - Single Responsibility Principle.

import java.util.ArrayList;

public class SRP {
    public static void main(String args[]) {
    }
}

/**
 * Product class for Product
 */
class Product {
    int price;
    String name;

    Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    Product(Product product) {
        this.price = product.price;
        this.name = product.name;
    }
}

/**
 * Shopping cart class
 */
class ShoppingCart {
    ArrayList<Product> products;

    ShoppingCart() {
    }

    void addItem(Product product) {
        this.products.add(new Product(product));
    }

    int calculateTotal() {
        int result = 0;
        return result;
    }
}