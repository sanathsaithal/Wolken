package com.wolken.markette.dao;

import java.util.List;

import com.wolken.markette.entity.MarketDetails;

public interface MarketDetailsDAO {

	boolean delete(MarketDetails details);

	boolean save(MarketDetails details);

	void getByid(int id);

	boolean update(MarketDetails details);

	List<MarketDetails> getDetails();

}
