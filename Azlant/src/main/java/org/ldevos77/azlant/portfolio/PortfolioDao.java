package org.ldevos77.azlant.portfolio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.ldevos77.azlant.asset.AssetClassDto;
import org.ldevos77.azlant.asset.AssetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * Data Access Object (DAO) for Portfolio class
 * 
 * @author ldevos77@gmail.com
 * 
 * @see PortfolioDto
 * @see PortfolioLineDto
 */
@Repository
public class PortfolioDao {
	
	/**
	 * 
	 */
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 
	 * @param dataSource Test
	 */
	@Autowired
	public void setDataSource (DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	/**
	 * Find all the existing portfolios in database
	 * 
	 * @return
	 */
	public List<PortfolioDto> findAll() {
		return jdbcTemplate.query("select * from portfolio", new PortfolioRowMapper());
	}
	
	/**
	 * 
	 * 
	 * @param id
	 * 		
	 * @return
	 */
	public PortfolioDto findById(int id) {
		List<PortfolioDto> portfolio = jdbcTemplate.query(
				"select p.id as portfolio_id, p.name as portfolio_name, " + 
				"pl.id as line_id, pl.quantity as line_quantity, pl.purchase_price as line_purchase_price, " + 
				"pl.trading_fees as line_trading_fees, a.id as asset_id, a.name as asset_name, " + 
				"a.isin_code as asset_isin_code, ac.id as asset_class_id, ac.name as asset_class_name " + 
				"from portfolio p, portfolio_line pl, asset a, asset_class ac " + 
				"where p.id=pl.portfolio_id " + 
				"and a.id=pl.asset_id " + 
				"and ac.id=a.asset_class_id " + 
				"and p.id=?", 
				new PortfolioDetailRsExtractor(), id);
		return portfolio.get(0);
	}
	
	/**
	 * 
	 * @author ldevos77@gmail.com
	 *
	 */
	public static final class PortfolioRowMapper implements RowMapper<PortfolioDto> {
		@Override
		public PortfolioDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			PortfolioDto portfolioDto = new PortfolioDto();
			portfolioDto.setId(rs.getInt("id"));
			portfolioDto.setName(rs.getString("name"));
			return portfolioDto;
		}
	}
	
	/**
	 * 
	 * @author ldevos77@gmail.com
	 *
	 */
	private static final class PortfolioDetailRsExtractor implements ResultSetExtractor<List<PortfolioDto>> {
		@Override
		public List<PortfolioDto> extractData(ResultSet rs) throws SQLException {
			List<PortfolioDto> portfolioList = new ArrayList<PortfolioDto>();
			PortfolioDto portfolio = new PortfolioDto();
			portfolio.setId(-1);
			while (rs.next()) {
				
				if (portfolio.getId() != -1 && portfolio.getId() != rs.getInt("portfolio_id")) {
					portfolioList.add(portfolio);
					portfolio = new PortfolioDto();
				}
				
				AssetClassDto assetClass = new AssetClassDto();
				assetClass.setId(rs.getInt("asset_class_id"));
				assetClass.setName(rs.getString("asset_class_name"));
				
				AssetDto asset = new AssetDto();
				asset.setId(rs.getInt("asset_id"));
				asset.setName(rs.getString("asset_name"));
				asset.setIsinCode(rs.getString("asset_isin_code"));
				asset.setAssetClass(assetClass);
				
				PortfolioLineDto portfolioLine = new PortfolioLineDto();
				portfolioLine.setId(rs.getInt("line_id"));
				portfolioLine.setQuantity(rs.getInt("line_quantity"));
				portfolioLine.setPurchasePrice(rs.getFloat("line_purchase_price"));
				portfolioLine.setTradingFees(rs.getFloat("line_trading_fees"));
				portfolioLine.setAsset(asset);
				
				portfolio.setName(rs.getString("portfolio_name"));
				portfolio.setId(rs.getInt("portfolio_id"));
				portfolio.addPortfolioLine(portfolioLine);
	        }
			if (portfolio.getId() != -1) {
				portfolioList.add(portfolio);
			}
	        return portfolioList;
	    }
	}
	
}
