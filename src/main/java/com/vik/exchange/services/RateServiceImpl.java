
package com.vik.exchange.services;

import com.vik.exchange.model.Rate;
import com.vik.exchange.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Repository
public class RateServiceImpl implements RateService{
    @Autowired
    RateRepository rateRepository;
    public void addRate(Rate rate) {
       rateRepository.save(rate);
    }
    
}
