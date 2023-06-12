package com.example.HotelApp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String fullName;
    @Column
    private String phone;
    @Column
    private String passport;
    @Column
    private String email;

    @ManyToOne(cascade ={CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.PERSIST},fetch = FetchType.LAZY)
    @JoinTable(
            name = "reservation",
            joinColumns = @JoinColumn(name = "guestId"),
            inverseJoinColumns = @JoinColumn(name = "roomNumber")
    )
    private List<Reservation> reservationList;
}
