package com.ps.bk.hotel.booking.service;

import java.util.List;

import com.ps.bk.hotel.booking.model.Booking;

public interface BookingService {
	public Booking getBookingById(long id);
	public Iterable<Booking> getBookings();
	public Long addBooking(Booking booking);
	public void updateBooking(Booking booking);
	public void deleteBooking(long id);
	public List<String> validateBookingDates(String checkInDate, String checkOutDate);
}
