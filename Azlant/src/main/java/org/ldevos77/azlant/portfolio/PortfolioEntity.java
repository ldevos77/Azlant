package org.ldevos77.azlant.portfolio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Portfolio
 *
 */
@Entity
@NamedQuery(name="PortfolioEntity.findAll", query="SELECT p FROM PortfolioEntity p")
@Table(name="portfolio")
public class PortfolioEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	/*
	 * CascadeType : No Cascade
	 * FetchType
	 *   EAGER : Relation is loading in same time than the father entity 
	 */
	@OneToMany(mappedBy="portfolio", fetch=FetchType.EAGER)
	private List<PortfolioLineEntity> portfolioLines;

	public PortfolioEntity() {
		super();
	}

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
	
	@Override
	public String toString() {
		return "Portfolio [id=" + id + ", name=" + name + "]";
	}

	public List<PortfolioLineEntity> getPortfolioLines() {
		return portfolioLines;
	}

	public void setPortfolioLines(List<PortfolioLineEntity> portfolioLines) {
		this.portfolioLines = portfolioLines;
	}
  
}
