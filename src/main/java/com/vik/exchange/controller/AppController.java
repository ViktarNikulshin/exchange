package com.vik.exchange.controller;

import com.vik.exchange.model.Currency;
import com.vik.exchange.model.Rate;
import com.vik.exchange.services.CurrencyService;
import com.vik.exchange.services.RateService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AppController {
    
    @Autowired
    CurrencyService currencyService;
    @Autowired
    RateService rateService;
    Currency currency = new Currency();
    Rate rate = new Rate();
    
        @RequestMapping(value =  "/", method = RequestMethod.GET)
        public String homePage() {
		return "welcome";
	}
    
	@RequestMapping(value =  "/addCurrency", method = RequestMethod.GET)
	public String adddCurrency(ModelMap model) {
                model.addAttribute("currency", currency);
		return "addCurrency";
	}

	@RequestMapping(value =  "/addCurrency", method = RequestMethod.POST)
	public String adddCurrency(@Valid Currency currency, ModelMap model) {
            currencyService.addCurrency(currency);
            model.addAttribute("currency", currency);
            return "currencyView" ; 
        }
        @RequestMapping(value =  "/addRate", method = RequestMethod.GET)
	public String getRate(ModelMap model) {
            
                model.addAttribute("rate", rate);
                model.addAttribute("currency", currency);
		return "addRate";
	}
        @RequestMapping(value =  "/addRate", method = RequestMethod.POST)
	public String adddCurrency(@RequestParam("cod")String cod, @Valid Rate rate, ModelMap model) {
            rate.setCurrency(currencyService.getCurrencyCod(cod));
            rateService.addRate(rate);
            model.addAttribute("rate", rate);
            return "welcome" ; 
        }
        @ModelAttribute("cods")
	public List<String> initializeCurrency() {

		List<String> cods = new ArrayList<String>();
		cods = currencyService.findAllCod();
		return cods;
	}
}
        
