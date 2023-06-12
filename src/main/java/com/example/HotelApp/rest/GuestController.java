package com.example.HotelApp.rest;

import com.example.HotelApp.domain.Guest;
import com.example.HotelApp.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GuestController {

    private final GuestService guestService;
    @PostMapping("/guest")
    public ResponseEntity<Void> save (@RequestBody Guest guest){
        guestService.save(guest);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}
