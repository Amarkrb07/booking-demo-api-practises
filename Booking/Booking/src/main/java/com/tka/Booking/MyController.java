package com.tka.Booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class MyController {
	@RequestMapping(value = "/bus" , method = RequestMethod.POST)
	public String bus() {
		return "Wel Come to Booking.com Enjoy Our Bus Servies....! Happy Jynary ";
	}
	@GetMapping("/busno")
	public int busNo() {
		return 70;
	}
	@RequestMapping(value = "/train" , method = RequestMethod.GET)
	public String train() {
		return "Train is stop on platform number 2";
	}
	@PostMapping("/trainno")
	public int trainNo() {
		return 23;
	}
	@GetMapping("/flight")
	public String flight() {
		return "Compare and book cheap flights with ease .......! ";
	}
	@PostMapping("/flightcount")
	public int flightCount() {
		return 20;
	}
	@GetMapping("/stays")
	public String stays() {
		return "Live the your dream in holiday home  , choose from houses villles and more......!";
	}
	@PostMapping("/room")
	public int avRoom() {
		return 30;
	}
	
	@RequestMapping(value = "/flight+hotal" , method = RequestMethod.GET)
	public String flightHotel() {
		return "10  hotals are avlible with fligth  ";
	}
	
}
