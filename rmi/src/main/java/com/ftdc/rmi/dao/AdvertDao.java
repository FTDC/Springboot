package com.ftdc.rmi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ftdc.rmi.mapper.AdvertMapper;

import ad.pojo.Advert;

@Repository
public class AdvertDao {
	
	@Autowired
	private AdvertMapper advertMapper;
	
	public void saveAdvert(Advert advert) {
		advertMapper.saveAdvert(advert);
	}
}
