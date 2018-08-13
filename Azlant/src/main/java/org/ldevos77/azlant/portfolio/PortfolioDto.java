package org.ldevos77.azlant.portfolio;

import java.util.ArrayList;
import java.util.List;

public class PortfolioDto {

	private int id;
	private String name;
	private List<PortfolioLineDto> portfolioLines;
	
	public PortfolioDto() {
		this.id=-1;
		this.name="";
		this.portfolioLines = new ArrayList<>();
	}

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
	
	@Override
    public String toString() {
        return String.format("Portfolio[id=%d, name='%s']", id, name);
    }

	public List<PortfolioLineDto> getPortfolioLines() {
		return portfolioLines;
	}

	public void setPortfolioLines(List<PortfolioLineDto> portfolioLines) {
		this.portfolioLines = portfolioLines;
	}
	
	public void addPortfolioLine(PortfolioLineDto portfolioLine) {
		this.portfolioLines.add(portfolioLine);
	}
   
}
