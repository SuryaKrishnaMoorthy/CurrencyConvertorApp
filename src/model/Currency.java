package model;

/**
 * Currency ENUM
 */
public enum Currency {
    USD("USD - US Dollar", "/images/usd.png"),
    GBP("GBP - British Pound", "/images/gbp.png"),
    INR("INR - Indian Rupee", "/images/inr.png"),
    JPY("JPY - Japanese Yen", "/images/jpy.png"),
    EUR("EUR - Euro", "/images/eur.png"),
    CAD("CAD - Canadian Dollar", "/images/cad.png");

    private final String imagePath;
    private final String displayString;

    private Currency(String displayString, String imagePath) {
        this.displayString = displayString;
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public String getDisplayString() {
        return this.displayString;
    }

    @Override
    public String toString() {
        return this.displayString;
    }

}
