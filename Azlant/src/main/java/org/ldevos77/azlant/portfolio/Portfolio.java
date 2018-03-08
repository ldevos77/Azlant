package org.ldevos77.azlant.portfolio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.ldevos77.azlant.asset.Asset;

/**
 * Entity implementation class for Entity: Portfolio
 *
 */
@Entity
@NamedQuery(name="Portfolio.findAll", query="SELECT p FROM Portfolio p")
@Table(name="portfolio")
public class Portfolio implements Serializable {

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
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="portfolio_asset",
		      joinColumns = @JoinColumn(name="portfolio_id", referencedColumnName="id"),
		      inverseJoinColumns = @JoinColumn(name="asset_id", referencedColumnName="id"))
	private List<Asset> assets;

	public Portfolio() {
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

	public List<Asset> getAssets() {
		return assets;
	}

	public void setAssets(List<Asset> assets) {
		this.assets = assets;
	}
   
}
