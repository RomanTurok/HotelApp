package com.example.HotelApp.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoomDto {

    private Long id;
    private String name;
    private int numberOfBeds;
    private int price;
}
