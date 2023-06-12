package com.example.HotelApp.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GuestDto {

    private Long id;
    private String fullName;
    private String phone;
    private String email;
    private List<String> reservation;

}
