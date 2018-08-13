package org.ldevos77.azlant.portfolio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.ldevos77.azlant.asset.AssetEntity;

/**
 * Entity implementation class for Entity: PortfolioLine
 *
 */
@Entity
@Table(name="portfolio_line")
public class PortfolioLineEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	/*
	 * CascadeType : No Cascade
	 * FetchType
	 *   EAGER : Relation is loading in same time than the father entity 
	 */
	@ManyToOne(targetEntity=AssetEntity.class, fetch=FetchType.EAGER)
	private List<AssetEntity> assets;
	
	@ManyToOne(targetEntity=PortfolioEntity.class, fetch=FetchType.EAGER)
	private PortfolioEntity portfolio;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="purchase_date")
	private transient LocalDate purchaseDate;
	
	@Column(name="purchase_price")
	private float purchasePrice;
	
	@Column(name="cost_price")
	private float costPrice;
	

	public PortfolioLineEntity() {
		super();
	}
   
}
