package com.ad.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ad.hotel.model.HotelModel;
import com.ad.hotel.service.HotelService;

@RestController
@RequestMapping("/hotelModel")
public class HotelController 
{
	@Autowired
	HotelService hotelservice;
	
	@PostMapping("/createHotel")
	public void createHotel(@RequestBody HotelModel hotel) 
	{
		hotelservice.createHotel(hotel);
	}
	
	@GetMapping("/id/{id}")
	public HotelModel getHotelbyId(@PathVariable String id) 
	{
		return hotelservice.getHotelbyId(id);
	}
	
	@GetMapping("/getAll")
	public List<HotelModel> getAllHotels()
	{
		return hotelservice.getAllHotels();
		
	}
 
}
