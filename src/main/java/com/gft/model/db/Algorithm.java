package com.gft.model.db;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne; 
@Entity
public class Algorithm {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @ManyToOne(targetEntity=Stock.class)
    private  Stock stock;
    private  String name;
    private double aggregateGain;
    private double absoluteGain;
    private BigDecimal priceBought;

    public Algorithm(Stock stock, String name) {
        this.stock = stock;
        this.name = name;
    }

    public Algorithm() {
	
	}

	public Stock getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public double getAggregateGain() {
        return aggregateGain;
    }

    public void setAggregateGain(double aggregateGain) {
        this.aggregateGain = aggregateGain;
    }

    public double getAbsoluteGain() {
        return absoluteGain;
    }

    public void setAbsoluteGain(double absoluteGain) {
        this.absoluteGain = absoluteGain;
    }

    public BigDecimal getPriceBought() {
        return priceBought;
    }

    public void setPriceBought(BigDecimal priceBought) {
        this.priceBought = priceBought;
    }

    public long getId() {
        return id;
    }
	
    public void setId(long id) {
        this.id = id;
    }
}
