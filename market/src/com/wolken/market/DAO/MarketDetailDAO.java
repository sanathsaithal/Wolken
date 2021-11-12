package com.wolken.market.DAO;

import com.wolken.market.DTO.MarketDetailsDTO;

public interface MarketDetailDAO {
	boolean save(MarketDetailsDTO mdto);

	boolean update(MarketDetailsDTO mdto);

	boolean getByLocation(String location);

	boolean getAll(MarketDetailsDTO mdto);

	boolean deleteByName(MarketDetailsDTO mdto);
}
