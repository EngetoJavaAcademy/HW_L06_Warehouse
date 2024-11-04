package inventory.management;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagement {

    public static void main(String[] args) {
        // Seznam produktů
        ArrayList<Product> products = new ArrayList<>();

        // Přidání produktů do seznamu
        products.add(new Product("Laptop", 20000));
        products.add(new Product("Telefon", 15000));
        products.add(new Product("Monitor", 8000));
        products.add(new Product("Klávesnice", 500));
        products.add(new Product("Myš", 300));

        // Přidání nového produktu
        products.add(new Product("Sluchátka", 2000));

        // Výpis všech produktů
        System.out.println("Seznam produktů:");
        for (Product product : products) {
            System.out.println(product);
        }

        // Odstranění produktu "Monitor"
        products.removeIf(product -> product.getName().equals("Monitor"));
        System.out.println("\nAktualizovaný seznam produktů po odstranění 'Monitor':");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Metoda pro vyhledání produktu
    public static Product findProduct(String productName, List<Product> products) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        System.out.println("Produkt '" + productName + "' není skladem.");
        return null;
    }

    // Metoda pro aktualizaci ceny produktu
    public static void updatePrice(String productName, double newPrice, List<Product> products) {
        Product product = findProduct(productName, products);
        if (product != null) {
            product.setPrice(newPrice);
            System.out.println("Cena produktu '" + productName + "' byla aktualizována na " + newPrice + " Kč.");
        }
    }
}