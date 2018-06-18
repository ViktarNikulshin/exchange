
package com.vik.exchange.services;

import com.vik.exchange.model.Currency;
import java.util.ArrayList;
import java.util.List;


public interface CurrencyService {
    void addCurrency (Currency currency);
    public List<String> findAllCod();
    public List<Currency> allCurrency();
   public Currency getCurrencyCod(String cod);
}
