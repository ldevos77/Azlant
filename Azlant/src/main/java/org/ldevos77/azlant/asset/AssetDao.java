package org.ldevos77.azlant.asset;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class AssetDao {

	@PersistenceContext
	private EntityManager entityManager;
	
}
