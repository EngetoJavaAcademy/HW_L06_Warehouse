package inventory.stock;

public class InventoryStockMain {

    public static void main(String[] args) {
        // Pole pro počty kusů produktů
        int[] stockLevels = {20, 50, 100, 15, 5};

        // Výpis počtu kusů pro každý produkt
        System.out.println("Stavy zásob pro jednotlivé produkty:");
        int totalStock = 0;
        for (int i = 0; i < stockLevels.length; i++) {
            System.out.println("Produkt " + (i + 1) + " má na skladě " + stockLevels[i] + " kusů.");
            totalStock += stockLevels[i]; // Sčítání celkového počtu kusů
        }

        // Výpis celkového počtu kusů na skladě
        System.out.println("Celkový počet všech kusů na skladě: " + totalStock);
    }
}
