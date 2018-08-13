package org.ldevos77.azlant.portfolio;

import org.ldevos77.azlant.asset.AssetDto;

public class PortfolioLineDto {

	private long id;
	private int quantity;
	private float purchasePrice;
	private float tradingFees;
	private AssetDto asset;
	
	public PortfolioLineDto() {
		this.id = -1;
		this.quantity = 0;
		this.purchasePrice = 0;
		this.tradingFees = 0;
		this.asset = new AssetDto();
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public float getPurchasePrice() {
		return purchasePrice;
	}
	
	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public float getTradingFees() {
		return tradingFees;
	}
	
	public void setTradingFees(float tradingFees) {
		this.tradingFees = tradingFees;
	}
	
	@Override
    public String toString() {
        return String.format("PortfolioLine[id=%d, quantity='%d']", id, quantity);
    }

	public AssetDto getAsset() {
		return asset;
	}

	public void setAsset(AssetDto asset) {
		this.asset = asset;
	}
	
}
