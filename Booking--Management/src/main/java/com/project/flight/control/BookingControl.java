package com.project.flight.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.flight.entity.Booking;
import com.project.flight.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingControl {

	@Autowired
	BookingService bookingService;

	@PostMapping("/addbooking")
	public String addBooking(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}

	@PutMapping("/updatebooking/{id}")
	public String updateBooking(@PathVariable String id, @RequestBody Booking booking) {
		return bookingService.updateBooking(id, booking);
	}

	@DeleteMapping("/deletebooking/{id}")
	public String deleteBooking(@PathVariable String id) {
		return bookingService.deleteBooking(id);
	}

	@GetMapping("/findbooking/{id}")
	public Booking findBooking(@PathVariable String id) {
		return bookingService.findBooking(id);
	}

	@GetMapping("/findallbookings")
	public List<Booking> findAllBookings() {
		return bookingService.findAllBookings();
	}

}

