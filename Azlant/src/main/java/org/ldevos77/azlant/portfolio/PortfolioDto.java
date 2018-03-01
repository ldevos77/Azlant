package org.ldevos77.azlant.portfolio;

public class PortfolioDto {

	private int id;
	private String name;
	
	public PortfolioDto() {
		super();
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
   
}
