package com.vik.exchange.controller;

import com.vik.exchange.model.Currency;
import com.vik.exchange.services.CurrencyService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    
    @Autowired
    CurrencyService currencyService;
    
        @GetMapping("/")
        public String homePage(ModelMap model) {
		return "welcome";
	}
    
//	@GetMapping("/currency")
//	public ArrayList getCustomers() {
//		return currencyService.allCurrency();
//	}

	@GetMapping("/currency/{cod}")
	public ResponseEntity getCustomer(@PathVariable("cod") String cod) {

		Currency currency = currencyService.getCurrencyCod(cod);
		if (currency == null) {
			return new ResponseEntity("No Customer found for ID " + cod, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(currency, HttpStatus.OK);
	}

	@PostMapping(value = "/currency")
	public ResponseEntity createCustomer(@RequestBody Currency currency) {

		currencyService.addCurrency(currency);

		return new ResponseEntity(currency, HttpStatus.OK);
	}

}
