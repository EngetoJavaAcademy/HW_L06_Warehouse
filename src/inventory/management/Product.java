package inventory.management;

class Product {
    private String name;
    private double price;

    // Konstruktor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter pro název
    public String getName() {
        return name;
    }

    // Setter pro cenu
    public void setPrice(double price) {
        this.price = price;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Produkt: " + name + ", Cena: " + price + " Kč";
    }
}