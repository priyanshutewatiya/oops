class Bus {
    int totalSeats = 2; // total available seats

    synchronized void bookSeat(String name, int seats) {
        if (totalSeats >= seats) {
            System.out.println(name + " successfully booked " + seats + " seat(s).");
            totalSeats -= seats;
            System.out.println("Seats left: " + totalSeats);
        } else {
            System.out.println(name + " failed to book. Not enough seats!");
        }
    }
}

class Passenger extends Thread {
    Bus bus;
    int seats;
    String passengerName;

    Passenger(Bus bus, int seats, String passengerName) {
        this.bus = bus;
        this.seats = seats;
        this.passengerName = passengerName;
    }

    public void run() {
        bus.bookSeat(passengerName, seats);
    }
}

public class BusBooking {
    public static void main(String[] args) {
        Bus redBus = new Bus();

        Passenger p1 = new Passenger(redBus, 1, "Priyanshu");
        Passenger p2 = new Passenger(redBus, 2, "Aman");

        p1.start();
        p2.start();
    }
}
