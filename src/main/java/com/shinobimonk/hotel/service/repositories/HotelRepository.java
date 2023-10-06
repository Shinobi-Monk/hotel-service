package com.shinobimonk.hotel.service.repositories;

import com.shinobimonk.hotel.service.entites.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {
}
