
package com.vik.exchange.services;

import com.vik.exchange.model.Currency;
import com.vik.exchange.repository.CurrencyRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Repository
public class CurrencyServiceImpl implements CurrencyService{
//    private static ArrayList<Currency> currencys;
//	{
//		currencys = new ArrayList();
//		currencys.add(new Currency("BUN", "Belarusian Rubl"));
//		currencys.add(new Currency("Russ", "Smith"));
//		currencys.add(new Currency("Kate", "Williams"));
//		currencys.add(new Currency("Kate", "Williams"));
//	}
    
    @Autowired
    CurrencyRepository currencyRepository;
    
    @Override
    @Transactional
    public void addCurrency(Currency currency) {
        currencyRepository.save(currency);
    }

//    public ArrayList<Currency> allCurrency() {
//      
//       return currencys;
//    }
    @Override
    @Transactional
    public Currency getCurrencyCod(String cod) {
        Currency currency = currencyRepository.findByCod(cod);
        
        return currency;
    }
    
}
