package org.ldevos77.azlant.stockexchange;

import org.ldevos77.azlant.geography.CountryDto;

public class StockExchangeDto {

	private int id;
	private String name;
	private CountryDto country;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public CountryDto getCountry() {
		return country;
	}
	
	public void setCountry(CountryDto country) {
		this.country = country;
	}
	
}
