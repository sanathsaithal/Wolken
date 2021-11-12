package com.wolken.maket_details.dao;

import com.wolken.maket_details.entity.MarketDetails;

public interface MarketDetailsDAO {

	boolean save(MarketDetails details);


	void getByid(int id);


	boolean update(MarketDetails details);


	


	boolean delete(MarketDetails details);

}
