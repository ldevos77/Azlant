package org.ldevos77.azlant.portfolio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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
	@Column(name="Id")
	private long id;
	
	@Column(name="name")
	private String name;

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
   
}
