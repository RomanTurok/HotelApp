package com.example.HotelApp.service;

import com.example.HotelApp.domain.Guest;
import com.example.HotelApp.dto.GuestDto;
import com.example.HotelApp.repository.GuestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GuestService {

    private final GuestRepository guestRepository;

    public void save (Guest guest) {
        guestRepository.save(guest);
    }

    public List<GuestDto> findAll(){
        return guestRepository.findAll().stream()
                .map(GuestService :: buildGuestDto).collect(Collectors.toList());
    }

    private static GuestDto buildGuestDto(Guest guest) {
        return GuestDto.builder()
                .id(guest.getId())
                .fullName(guest.getFullName())
                .phone(guest.getPhone())
                .email(guest.getEmail())
                .build();
    }
}
