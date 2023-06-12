package com.example.HotelApp.dto;

import lombok.Builder;
import lombok.Data;

import java.rmi.StubNotFoundException;
import java.util.List;

@Data
@Builder
public class ReservationDto {

    private Long id;
    private String roomNumber;
    private String guestId;
    private String startDate;
    private String endDate;
}
