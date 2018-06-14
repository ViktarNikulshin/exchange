
package com.vik.exchange.services;

import com.vik.exchange.model.Currency;
import java.util.ArrayList;


public interface CurrencyService {
    void addCurrency (Currency currency);
//    ArrayList<Currency> allCurrency();
    Currency getCurrencyCod(String cod);
}
