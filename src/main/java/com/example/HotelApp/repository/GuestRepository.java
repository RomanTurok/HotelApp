package com.example.HotelApp.repository;

import com.example.HotelApp.domain.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

    @Query("SELECT g FROM Guest g where q.fullName LIKE %?1? or g.passport LIKE %?2%")
    List<Guest> findByFullNameOrPassport(String fullName, String passport);
}
