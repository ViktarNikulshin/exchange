package com.vik.exchange.repository;

import com.vik.exchange.model.Rate;
import org.springframework.data.repository.CrudRepository;


public interface RateRepository extends CrudRepository<Rate, String>{
    
}
