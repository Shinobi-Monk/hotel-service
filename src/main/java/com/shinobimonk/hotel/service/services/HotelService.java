package com.shinobimonk.hotel.service.services;

import com.shinobimonk.hotel.service.entites.Hotel;

import java.util.List;

public interface HotelService {
    public Hotel saveHotel(Hotel hotel);
    public List<Hotel> fetchAllHotels();
    public Hotel fetchHotelById(String hotelId);
}
