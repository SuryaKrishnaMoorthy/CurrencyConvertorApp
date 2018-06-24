package model;

/**
 * ExchangeRate bean
 */
public class ExchangeRate {

    private final Currency source;
    private final Currency target;
    private final double conversionRate;
    private final double fees;

    public Currency getSource() {
        return source;
    }

    public Currency getTarget() {
        return target;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public double getFees() {
        return fees;
    }

    public ExchangeRate(Currency source, Currency target, double conversionRate, double fees) {
        this.source = source;
        this.target = target;
        this.conversionRate = conversionRate;
        this.fees = fees;
    }

}
