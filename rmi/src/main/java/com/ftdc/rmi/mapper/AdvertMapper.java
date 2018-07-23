package com.ftdc.rmi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import ad.pojo.Advert;

@Mapper
public interface AdvertMapper {

	public void saveAdvert(@Param("advert") Advert advert);
}
