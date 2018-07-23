package com.ftdc.rmi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ad.iface.AdvertInterface;


import com.ftdc.rmi.dao.AdvertDao;

import ad.pojo.Advert;

@Service
public class AdvertService implements AdvertInterface {

	@Autowired
	private AdvertDao advertDao;
	
	@Override
	public void saveAdvert(Advert advert) {
		advertDao.saveAdvert(advert);
	}
}
