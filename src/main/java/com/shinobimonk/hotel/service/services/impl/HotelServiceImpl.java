package com.shinobimonk.hotel.service.services.impl;

import com.shinobimonk.hotel.service.entites.Hotel;
import com.shinobimonk.hotel.service.exception.ResourceNotFoundException;
import com.shinobimonk.hotel.service.repositories.HotelRepository;
import com.shinobimonk.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel saveHotel(Hotel hotel) {
        hotel.setId(UUID.randomUUID().toString());
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> fetchAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel fetchHotelById(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel Not found on server!! Hotel id : "+hotelId));
    }
}
