package data;

import java.util.ArrayList;
import model.Bank;
import model.Currency;
import model.CurrencyConversionService;
import model.ExchangeRate;

/**
 * This class holds the exchange rate data for currency converter
 */
public class DataLoader {

    public static ArrayList<CurrencyConversionService> getConversionServices() {
        ArrayList<CurrencyConversionService> banks = new ArrayList<>();
        ArrayList<ExchangeRate> bofa_rates = new ArrayList<>();
        bofa_rates.add(new ExchangeRate(Currency.USD, Currency.USD, 1, 0));
        bofa_rates.add(new ExchangeRate(Currency.USD, Currency.CAD, 1.36558, 5));
        bofa_rates.add(new ExchangeRate(Currency.USD, Currency.EUR, 0.91770, 5));
        bofa_rates.add(new ExchangeRate(Currency.USD, Currency.GBP, 0.77226, 3));
        bofa_rates.add(new ExchangeRate(Currency.USD, Currency.INR, 64.2627, 200));
        bofa_rates.add(new ExchangeRate(Currency.USD, Currency.JPY, 111.520, 1000));

        bofa_rates.add(new ExchangeRate(Currency.CAD, Currency.USD, 0.73232, 3));
        bofa_rates.add(new ExchangeRate(Currency.CAD, Currency.CAD, 1, 0));
        bofa_rates.add(new ExchangeRate(Currency.CAD, Currency.EUR, 0.67212, 3));
        bofa_rates.add(new ExchangeRate(Currency.CAD, Currency.GBP, 0.56438, 3));
        bofa_rates.add(new ExchangeRate(Currency.CAD, Currency.INR, 47.0605, 200));
        bofa_rates.add(new ExchangeRate(Currency.CAD, Currency.JPY, 82.5778, 1000));

        bofa_rates.add(new ExchangeRate(Currency.EUR, Currency.USD, 1.09999, 3));
        bofa_rates.add(new ExchangeRate(Currency.EUR, Currency.CAD, 1.50114, 5));
        bofa_rates.add(new ExchangeRate(Currency.EUR, Currency.EUR, 1, 0));
        bofa_rates.add(new ExchangeRate(Currency.EUR, Currency.GBP, 0.8414, 3));
        bofa_rates.add(new ExchangeRate(Currency.EUR, Currency.INR, 70.6059, 200));
        bofa_rates.add(new ExchangeRate(Currency.EUR, Currency.JPY, 123.688, 1000));

        bofa_rates.add(new ExchangeRate(Currency.GBP, Currency.USD, 1.30232, 3));
        bofa_rates.add(new ExchangeRate(Currency.GBP, Currency.CAD, 1.76769, 5));
        bofa_rates.add(new ExchangeRate(Currency.GBP, Currency.EUR, 1.18039, 3));
        bofa_rates.add(new ExchangeRate(Currency.GBP, Currency.GBP, 1, 0));
        bofa_rates.add(new ExchangeRate(Currency.GBP, Currency.INR, 83.2010, 200));
        bofa_rates.add(new ExchangeRate(Currency.GBP, Currency.JPY, 145.123, 1000));

        bofa_rates.add(new ExchangeRate(Currency.INR, Currency.USD, 0.01454, 3));
        bofa_rates.add(new ExchangeRate(Currency.INR, Currency.CAD, 0.02134, 5));
        bofa_rates.add(new ExchangeRate(Currency.INR, Currency.EUR, 0.01423, 3));
        bofa_rates.add(new ExchangeRate(Currency.INR, Currency.GBP, 0.01199, 3));
        bofa_rates.add(new ExchangeRate(Currency.INR, Currency.INR, 1, 0));
        bofa_rates.add(new ExchangeRate(Currency.INR, Currency.JPY, 1.74312, 1000));

        bofa_rates.add(new ExchangeRate(Currency.JPY, Currency.USD, 0.008971, 3));
        bofa_rates.add(new ExchangeRate(Currency.JPY, Currency.CAD, 0.012340, 5));
        bofa_rates.add(new ExchangeRate(Currency.JPY, Currency.EUR, 0.008168, 3));
        bofa_rates.add(new ExchangeRate(Currency.JPY, Currency.GBP, 0.006934, 3));
        bofa_rates.add(new ExchangeRate(Currency.JPY, Currency.INR, 0.570567, 200));
        bofa_rates.add(new ExchangeRate(Currency.JPY, Currency.JPY, 1, 0));
        banks.add(new Bank("Bank of America", bofa_rates));

        ArrayList<ExchangeRate> chase_rates = new ArrayList<>();
        chase_rates.add(new ExchangeRate(Currency.USD, Currency.USD, 1, 0));
        chase_rates.add(new ExchangeRate(Currency.USD, Currency.CAD, 1.36512, 5));
        chase_rates.add(new ExchangeRate(Currency.USD, Currency.EUR, 0.90911, 5));
        chase_rates.add(new ExchangeRate(Currency.USD, Currency.GBP, 0.77035, 3));
        chase_rates.add(new ExchangeRate(Currency.USD, Currency.INR, 64.2121, 150));
        chase_rates.add(new ExchangeRate(Currency.USD, Currency.JPY, 112.710, 1000));

        chase_rates.add(new ExchangeRate(Currency.CAD, Currency.USD, 0.73251, 3));
        chase_rates.add(new ExchangeRate(Currency.CAD, Currency.CAD, 1, 0));
        chase_rates.add(new ExchangeRate(Currency.CAD, Currency.EUR, 0.66661, 3));
        chase_rates.add(new ExchangeRate(Currency.CAD, Currency.GBP, 0.56514, 3));
        chase_rates.add(new ExchangeRate(Currency.CAD, Currency.INR, 47.1178, 150));
        chase_rates.add(new ExchangeRate(Currency.CAD, Currency.JPY, 82.6678, 1000));

        chase_rates.add(new ExchangeRate(Currency.EUR, Currency.USD, 1.09667, 3));
        chase_rates.add(new ExchangeRate(Currency.EUR, Currency.CAD, 1.50411, 5));
        chase_rates.add(new ExchangeRate(Currency.EUR, Currency.EUR, 1, 0));
        chase_rates.add(new ExchangeRate(Currency.EUR, Currency.GBP, 0.84733, 3));
        chase_rates.add(new ExchangeRate(Currency.EUR, Currency.INR, 70.7394, 150));
        chase_rates.add(new ExchangeRate(Currency.EUR, Currency.JPY, 123.981, 1000));

        chase_rates.add(new ExchangeRate(Currency.GBP, Currency.USD, 1.23232, 3));
        chase_rates.add(new ExchangeRate(Currency.GBP, Currency.CAD, 1.77505, 5));
        chase_rates.add(new ExchangeRate(Currency.GBP, Currency.EUR, 1.18456, 3));
        chase_rates.add(new ExchangeRate(Currency.GBP, Currency.GBP, 1, 0));
        chase_rates.add(new ExchangeRate(Currency.GBP, Currency.INR, 82.4901, 150));
        chase_rates.add(new ExchangeRate(Currency.GBP, Currency.JPY, 146.321, 1000));

        chase_rates.add(new ExchangeRate(Currency.INR, Currency.USD, 0.01467, 3));
        chase_rates.add(new ExchangeRate(Currency.INR, Currency.CAD, 0.02122, 5));
        chase_rates.add(new ExchangeRate(Currency.INR, Currency.EUR, 0.01567, 3));
        chase_rates.add(new ExchangeRate(Currency.INR, Currency.GBP, 0.01278, 3));
        chase_rates.add(new ExchangeRate(Currency.INR, Currency.INR, 1, 0));
        chase_rates.add(new ExchangeRate(Currency.INR, Currency.JPY, 1.73450, 1000));

        chase_rates.add(new ExchangeRate(Currency.JPY, Currency.USD, 0.008871, 3));
        chase_rates.add(new ExchangeRate(Currency.JPY, Currency.CAD, 0.012110, 5));
        chase_rates.add(new ExchangeRate(Currency.JPY, Currency.EUR, 0.008134, 3));
        chase_rates.add(new ExchangeRate(Currency.JPY, Currency.GBP, 0.006979, 3));
        chase_rates.add(new ExchangeRate(Currency.JPY, Currency.INR, 0.56892, 150));
        chase_rates.add(new ExchangeRate(Currency.JPY, Currency.JPY, 1, 0));

        banks.add(new Bank("Chase bank", chase_rates));

        ArrayList<ExchangeRate> wells_rates = new ArrayList<>();
        wells_rates.add(new ExchangeRate(Currency.USD, Currency.USD, 1, 0));
        wells_rates.add(new ExchangeRate(Currency.USD, Currency.CAD, 1.36510, 3));
        wells_rates.add(new ExchangeRate(Currency.USD, Currency.EUR, 0.90901, 7));
        wells_rates.add(new ExchangeRate(Currency.USD, Currency.GBP, 0.77020, 3));
        wells_rates.add(new ExchangeRate(Currency.USD, Currency.INR, 64.2211, 200));
        wells_rates.add(new ExchangeRate(Currency.USD, Currency.JPY, 112.518, 1000));

        wells_rates.add(new ExchangeRate(Currency.CAD, Currency.USD, 0.73254, 7));
        wells_rates.add(new ExchangeRate(Currency.CAD, Currency.CAD, 1, 0));
        wells_rates.add(new ExchangeRate(Currency.CAD, Currency.EUR, 0.67101, 5));
        wells_rates.add(new ExchangeRate(Currency.CAD, Currency.GBP, 0.56431, 3));
        wells_rates.add(new ExchangeRate(Currency.CAD, Currency.INR, 47.0599, 200));
        wells_rates.add(new ExchangeRate(Currency.CAD, Currency.JPY, 82.5678, 500));

        wells_rates.add(new ExchangeRate(Currency.EUR, Currency.USD, 1.08989, 7));
        wells_rates.add(new ExchangeRate(Currency.EUR, Currency.CAD, 1.50141, 5));
        wells_rates.add(new ExchangeRate(Currency.EUR, Currency.EUR, 1, 0));
        wells_rates.add(new ExchangeRate(Currency.EUR, Currency.GBP, 0.84155, 3));
        wells_rates.add(new ExchangeRate(Currency.EUR, Currency.INR, 70.7890, 200));
        wells_rates.add(new ExchangeRate(Currency.EUR, Currency.JPY, 122.998, 1000));

        wells_rates.add(new ExchangeRate(Currency.GBP, Currency.USD, 1.29832, 7));
        wells_rates.add(new ExchangeRate(Currency.GBP, Currency.CAD, 1.78453, 5));
        wells_rates.add(new ExchangeRate(Currency.GBP, Currency.EUR, 1.18876, 5));
        wells_rates.add(new ExchangeRate(Currency.GBP, Currency.GBP, 1, 0));
        wells_rates.add(new ExchangeRate(Currency.GBP, Currency.INR, 83.5010, 200));
        wells_rates.add(new ExchangeRate(Currency.GBP, Currency.JPY, 146.678, 500));

        wells_rates.add(new ExchangeRate(Currency.INR, Currency.USD, 0.015584, 7));
        wells_rates.add(new ExchangeRate(Currency.INR, Currency.CAD, 0.02025, 5));
        wells_rates.add(new ExchangeRate(Currency.INR, Currency.EUR, 0.01414, 5));
        wells_rates.add(new ExchangeRate(Currency.INR, Currency.GBP, 0.01197, 3));
        wells_rates.add(new ExchangeRate(Currency.INR, Currency.INR, 1, 0));
        wells_rates.add(new ExchangeRate(Currency.INR, Currency.JPY, 1.75261, 200));

        wells_rates.add(new ExchangeRate(Currency.JPY, Currency.USD, 0.0088119, 7));
        wells_rates.add(new ExchangeRate(Currency.JPY, Currency.CAD, 0.014359, 5));
        wells_rates.add(new ExchangeRate(Currency.JPY, Currency.EUR, 0.0080659, 5));
        wells_rates.add(new ExchangeRate(Currency.JPY, Currency.GBP, 0.0068347, 3));
        wells_rates.add(new ExchangeRate(Currency.JPY, Currency.INR, 0.57010, 200));
        wells_rates.add(new ExchangeRate(Currency.JPY, Currency.JPY, 1, 0));
        banks.add(new Bank("Wells Fargo bank", wells_rates));
        return banks;
    }

}
