package model;

/**
 * CurrencyConversionService is the service for currency conversion
 */
public interface CurrencyConversionService {

    String getServiceName();

    double convertCurrency(double amount, Currency source, Currency target);

    ExchangeRate getCurrentExchangeRate(Currency source, Currency target);

}
