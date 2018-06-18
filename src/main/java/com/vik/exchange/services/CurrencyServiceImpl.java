
package com.vik.exchange.services;

import com.vik.exchange.model.Currency;
import com.vik.exchange.repository.CurrencyRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Repository
@Component
public class CurrencyServiceImpl implements CurrencyService{
        
    @Autowired
    CurrencyRepository currencyRepository;
    
    @Override
    @Transactional
    public void addCurrency(Currency currency) {
        currencyRepository.save(currency);
    }
    @Override
    @Transactional
    public List<Currency> allCurrency() {
      List<Currency> currencys = new ArrayList<Currency>();
        currencys = (List<Currency>) currencyRepository.findAll();
       return currencys;
    }
    @Override
    @Transactional
    public Currency getCurrencyCod(String cod) {
        Currency currency = currencyRepository.findByCod(cod);
        
        return currency;
    }
    @Override
    @Transactional
    public List<String> findAllCod() {
        List<String> cods = new ArrayList<String>();
        for (Currency currency : allCurrency()) {
            cods.add(currency.getCod());
        }
        return  cods;
    }
    
}
