
package com.vik.exchange.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "currency")

public class Currency implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    private Long id;
    private String cod;
    private String nameCurrency;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "currency" )
    private Set<Rate> rates = new HashSet<Rate>(0);

    public Currency(String cod, String nameCurrency) {
        this.cod = cod;
        this.nameCurrency = nameCurrency;
    }

    
    public Long getId() {
        return id;
    }

    public String getCod() {
        return cod;
    }

    public String getNameCurrency() {
        return nameCurrency;
    }
    
   
    public Set<Rate> getEmployees() {
        return rates;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setNameCurrency(String nameCurrency) {
        this.nameCurrency = nameCurrency;
    }
    
    public void setEmployees(Set<Rate> employees) {
        this.rates = rates;
    }

    public Currency() {
    }

    public Currency(Long id) {
        this.id = id;
    }

    
    
    
}
