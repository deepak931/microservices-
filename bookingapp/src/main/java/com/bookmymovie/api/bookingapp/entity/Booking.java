package com.bookmymovie.api.bookingapp.entity;

import com.bookmymovie.api.bookingapp.constants.BookingStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Booking extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    private Long bookingId;

    private LocalDate bookingDate;

    @OneToOne
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    private Ticket ticket;

    private BookingStatus status;

}
