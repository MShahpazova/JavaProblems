package stardust;

import java.util.Vector;

public class Controller {

    public static Vector<Flight> generateTestObjects() {
        Flight sofiaBarselona = new Flight("1", AirplaneType.AIRBUS_321,
                new Location("Bulgaria", "1234", "Sofia"),
                new Location("Spain", "23144", "Barselona"));

        Flight sofiaRome = new Flight("2", AirplaneType.AIRBUS_340,
                new Location("Bulgaria", "1234", "Sofia"),
                new Location("Italy", "23144", "Rome"));

        Flight sofiaLondon = new Flight("3", AirplaneType.AIRBUS_380,
                new Location("Bulgaria", "1234", "Sofia"),
                new Location("England", "23144", "London"));
        sofiaBarselona.addEmployee(
                new Pilot("Maria", "24.08", 4000f, "888888", "01.06", PilotStatus.CAPTAIN));
        sofiaBarselona.addEmployee(new Steward("Karen", "03.03", 2000f, "555555", "27.05"));
        sofiaBarselona.addPassenger(new Passenger("Maria", "24.08",
                ID_Token.DRIVING_LICENCE, PassengerStatus.GOLD_MEMBER));
        sofiaBarselona.addPassenger(new Passenger("Mike", "24.12",
                ID_Token.PASSPORT, PassengerStatus.DIAMOND_MEMBER));

        sofiaLondon.addEmployee(new Pilot("Ivan", "04.08", 6000f,
                "87788", "01.06", PilotStatus.TRAINEE));
        sofiaLondon.addEmployee(new Steward("Hari", "03.03", 1800f, "44444", "15.05"));
        sofiaLondon.addPassenger(new Passenger("Katia", "01.08", ID_Token.IDENTITY_CARD, PassengerStatus.PLATIN_MEMBER));

        sofiaRome.addEmployee(new Pilot("Ana", "01.01", 2000f, "888888", "01.07", PilotStatus.COPILOT));
        sofiaRome.addEmployee(new Steward("Stavri", "01.09", 1800f, "44444", "15.05"));
        sofiaRome.addPassenger(new Passenger("Stefanie", "08.08", ID_Token.DRIVING_LICENCE, PassengerStatus.GOLD_MEMBER));
        sofiaRome.addPassenger(new Passenger("Ivo", "02.09", ID_Token.IDENTITY_CARD, PassengerStatus.PLATIN_MEMBER));

        Vector<Flight> flights = new Vector<>();
        flights.add(sofiaBarselona);
        flights.add(sofiaLondon);
        flights.add(sofiaRome);
        return flights;
    }

    public static void main(String[] args) {
        Vector<Flight> flights = generateTestObjects();
        flights.stream().forEach(flight -> System.out.println(flight));
    }
}

