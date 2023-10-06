package com.shinobimonk.hotel.service.controller;

import com.shinobimonk.hotel.service.entites.Hotel;
import com.shinobimonk.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> saveHotelDetails (@RequestBody Hotel hotel) {
        Hotel hotel1 = hotelService.saveHotel(hotel);
        return new ResponseEntity<>(hotel1, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> fetchAllHotelDetails () {
        return new ResponseEntity<>(hotelService.fetchAllHotels(), HttpStatus.OK);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> fetchHotelDetailsById (@PathVariable String hotelId) {
        return new ResponseEntity<>(hotelService.fetchHotelById(hotelId), HttpStatus.CREATED);
    }

}
