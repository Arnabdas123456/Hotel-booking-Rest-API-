package com.ad.hotel.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ad.hotel.model.HotelModel;

@Service
public class HotelService {

	List<HotelModel> hotelList=new ArrayList<>();
	
	 Map<String,HotelModel> hotelMap=new HashMap<>();
	
	public void createHotel(HotelModel hotel) 
	{
	  hotelList.add(hotel);
	  hotelMap.put(hotel.getId(), hotel);
		
	}
	
	public HotelModel getHotelbyId(String id) 
	{
		return hotelMap.get(id);
	}

	public List<HotelModel> getAllHotels() 
	{
		
		return hotelList;
	}
  
}
