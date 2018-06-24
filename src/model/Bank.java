package model;

import java.util.ArrayList;

/**
 * This class implements the logic of currency exchange of a bank
 */
public class Bank implements CurrencyConversionService {

    private final String name;
    private final ArrayList<ExchangeRate> rates;

    public Bank(String name, ArrayList<ExchangeRate> rates) {
        this.name = name;
        this.rates = rates;
    }

    @Override
    public String getServiceName() {
        return name;
    }

    @Override
    public double convertCurrency(double amount, Currency source, Currency target) {
        ExchangeRate er = this.getCurrentExchangeRate(source, target);
        return amount * er.getConversionRate() - er.getFees();
    }

    @Override
    public ExchangeRate getCurrentExchangeRate(Currency source, Currency target) {
        for (ExchangeRate er : rates) {
            if (er.getSource() == source && er.getTarget() == target) {
                return er;
            }
        }
        throw new RuntimeException("The bank does not support conversion of "
                + source + " to " + target + " currency");
    }

    @Override
    public String toString() {
        return "Bank - " + name;
    }
}
