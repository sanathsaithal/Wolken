package com.wolken.mobile.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.mobile.dao.MobileDao;
import com.wolken.mobile.dto.MobileDto;
import com.wolken.mobile.entity.MobileEntity;

@Component
public class MobileServiceImpl implements MobileService{

	@Autowired
	MobileDao dao;
	public void save(MobileDto dto) {
		MobileEntity entity=new MobileEntity();
		
		if(!dto.getBrandName().equals(null) && !dto.getBrandName().equals("")) {
			if(!dto.getModelNo().equals(null) && !dto.getModelNo().equals("")) {
				if(!dto.getModelName().equals(null) && !dto.getModelName().equals("")) {
					if(!dto.getType().equals(null) && !dto.getType().equals("")) {
						if(dto.getRam()<16) {
							if(dto.getRom()<256) {
								if(dto.getPrice()<99999) {
									if(!dto.getAvailability().equals(null) && !dto.getAvailability().equals("")) {
										
										
										
										BeanUtils.copyProperties(dto, entity);
										dao.save(entity);
									} else {
										System.out.println("availability not added");
									}
								} else {
									System.out.println("price not added");
								}
							} else {
								System.out.println("rom not added");
							}
						} else {
							System.out.println("ram not added");
						}
					} else {
						System.out.println("type not added");
					}
				} else {
					System.out.println("model name not added");
				}
			} else {
				System.out.println("model no not added");
			}
		} else {
			System.out.println("brand name not added");
		}
	}
	public List getByPrice(int price) {
		List list = null;
		if(price>1000) {
			MobileEntity entity=new MobileEntity();
			list=dao.getByPrice(price);
		}
		return list;
	}
	public List getByBrand(String bName) {
		List list = null;
		if(!bName.equals(null) && !bName.equals("")) {
			MobileEntity entity=new MobileEntity();
			list=dao.getByBrand(bName);
		}
		return list;
	}
	public MobileEntity updatePrice(String modelNo, int price) {
		MobileEntity entity=new MobileEntity();
		if(!modelNo.equals(null) && !modelNo.equals("")) {
			if(price>1000) {
				entity=dao.updatePriceByModelNo(modelNo,price);
			}
		}
		return entity;
	}
	public MobileEntity updateAvailability(String modelName, Boolean availability) {
		MobileEntity entity=new MobileEntity();
		if(!modelName.equals(null) && !modelName.equals("")) {
			if(availability!=null) { 
				entity=dao.updateAvailabilityByModelName(modelName,availability);
			}
		}
		return entity;
	}
}

