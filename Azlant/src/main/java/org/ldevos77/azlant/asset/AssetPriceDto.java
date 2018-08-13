package org.ldevos77.azlant.asset;

import java.time.LocalDate;

public class AssetPriceDto {
	
	private int id;
	private AssetDto asset;
	private LocalDate quotationDate;
	private float price;
	
	public AssetDto getAsset() {
		return asset;
	}
	
	public void setAsset(AssetDto asset) {
		this.asset = asset;
	}
	
	public LocalDate getQuotationDate() {
		return quotationDate;
	}
	
	public void setQuotationDate(LocalDate quotationDate) {
		this.quotationDate = quotationDate;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
