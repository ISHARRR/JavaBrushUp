package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Theatre.Seat> seats = new ArrayList();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 65 + (numRows - 1);

        for(char row = 'A'; row <= lastRow; ++row) {
            for(int seatNum = 1; seatNum <= seatsPerRow; ++seatNum) {
                Theatre.Seat seat = new Theatre.Seat(row + String.format("%02d", seatNum));
                this.seats.add(seat);
            }
        }

    }

    public String getTheatreName() {
        return this.theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Theatre.Seat requestedSeat = null;
        Iterator var3 = this.seats.iterator();

        while(var3.hasNext()) {
            Theatre.Seat seat = (Theatre.Seat)var3.next();
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        } else {
            return requestedSeat.reserve();
        }
    }

    public void getSeats() {
        Iterator var1 = this.seats.iterator();

        while(var1.hasNext()) {
            Theatre.Seat seat = (Theatre.Seat)var1.next();
            System.out.println(seat.getSeatNumber());
        }

    }

    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + this.seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + this.seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return this.seatNumber;
        }
    }
}
