
package com.vik.exchange.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rate")
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod")
    private Currency currency;
    private String dateChange;
    private String change;

    public Rate(Long id, Currency currency, String dateChange, String change) {
        this.id = id;
        this.currency = currency;
        this.dateChange = dateChange;
        this.change = change;
    }

    public Rate() {
    }

    public Rate(Long id, String dateChange, String change) {
        this.id = id;
        this.dateChange = dateChange;
        this.change = change;
    }

    public Rate(String dateChange, String change) {
        this.dateChange = dateChange;
        this.change = change;
    }
    
    

    public Long getId() {
        return id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getDateChange() {
        return dateChange;
    }

    public String getChange() {
        return change;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setDateChange(String dateChange) {
        this.dateChange = dateChange;
    }

    public void setChange(String change) {
        this.change = change;
    }
    
    
}
