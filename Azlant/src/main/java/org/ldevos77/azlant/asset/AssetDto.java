package org.ldevos77.azlant.asset;

import org.ldevos77.azlant.stockexchange.StockExchangeDto;

public class AssetDto {
	
	private long id;
	private String name;
	private String isinCode;
	private AssetClassDto assetClass;
	private StockExchangeDto stockExchange;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIsinCode() {
		return isinCode;
	}
	
	public void setIsinCode(String isinCode) {
		this.isinCode = isinCode;
	}
	
	public AssetClassDto getAssetClass() {
		return assetClass;
	}
	
	public void setAssetClass(AssetClassDto assetClass) {
		this.assetClass = assetClass;
	}

	public StockExchangeDto getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(StockExchangeDto stockExchange) {
		this.stockExchange = stockExchange;
	}
	
}
