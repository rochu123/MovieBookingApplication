package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.example.SeatStatus.AVAILABLE;

public class Show {

    private String id;
    private Movie movie;
    private long startTime;
    private long endTime;

    private List<Seat> seats;

    public Show(Movie movie, long startTime, long endTime, int totalSeats) {
        this.id = UUID.randomUUID().toString();
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        this.seats = new ArrayList<>();

        for (int i = 0; i < totalSeats; i++) {
            Seat seat = new Seat();
            seat.setId(UUID.randomUUID().toString());
            seat.setNumber(i + 1);
            seat.setStatus(AVAILABLE);
            this.seats.add(seat);
        }
    }
}
