package stardust;

import java.util.Vector;

public class Flight {
    private String flightNumber;
    private AirplaneType airplaneType;
    private Vector<Employee> crew = new Vector<>();
    private Vector<Passenger> passengers = new Vector<>();
    private Location origin;
    private Location destination;

    public Flight(String flightNumber, AirplaneType airplaneType, Location origin, Location destination) {
        setFlightNumber(flightNumber);
        setAirplaneType(airplaneType);
        this.origin = origin;
        this.destination = destination;
    }

    public void setFlightNumber(String flightNumber) {
        if (flightNumber == null || flightNumber.isEmpty()) {
            throw new IllegalArgumentException("Flight number must not be empty.");
        }
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void setAirplaneType(AirplaneType airplaneType) {
        if (Validator.checkAirplaneType(airplaneType.name())) {
            this.airplaneType = airplaneType;
        } else {
            throw new IllegalArgumentException("Airplane type isn't valid.");
        }
    }

    public AirplaneType getAirplaneType() {
        return this.airplaneType;
    }

    public void addEmployee(Employee employeeToBeAdded) {
        this.crew.add(employeeToBeAdded);
    }

    public void addPassenger(Passenger passengerToBeAdded) {
        this.passengers.add(passengerToBeAdded);
    }

    public Iterable<Employee> getCrew() {
        return this.crew;
    }

    public Iterable<Passenger> getPassengers() {
        return this.passengers;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", airplaneType=" + airplaneType +
                ", crew=" + crew +
                ", passengers=" + passengers +
                ", origin=" + origin +
                ", destination=" + destination +
                '}';
    }
}
