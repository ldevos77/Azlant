package org.ldevos77.azlant.portfolio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class PortfolioDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void persist(Portfolio portfolio) {
		entityManager.persist(portfolio);
	}
	
	public List<Portfolio> findAll() {
		TypedQuery<Portfolio> portfolioQuery = entityManager.createNamedQuery("Portfolio.findAll", Portfolio.class);
		List<Portfolio> portfolios = portfolioQuery.getResultList();
		return portfolios;
	}
	
	public Portfolio findById(long id) {
		return entityManager.find(Portfolio.class, id);
	}

}
