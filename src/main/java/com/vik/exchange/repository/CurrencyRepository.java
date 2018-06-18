
package com.vik.exchange.repository;

import com.vik.exchange.model.Currency;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<Currency, String>{

    public Currency findByCod(String cod);

   
  
}
