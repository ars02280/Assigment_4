package interfaces;

public interface PricedItem {
    double getPrice();

    // Default метод (Advanced Feature)
    default double getPriceWithTax() {
        return getPrice() * 1.20; // Например, НДС 20%
    }

    // Static метод (Advanced Feature)
    static boolean isValidPrice(double price) {
        return price >= 0;
    }
}