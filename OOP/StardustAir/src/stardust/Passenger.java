package stardust;

public class Passenger extends Person {

    private ID_Token id_token;
    private PassengerStatus passengerStatus;

    public Passenger(String name, String birthDate, ID_Token idToken, PassengerStatus passengerStatus) {
        super(name, birthDate);
        setId_token(idToken);
        setPassengerStatus(passengerStatus);
    }

    public void setId_token(ID_Token id_token) {
        if (!Validator.checkIdType(id_token.name())) {
            throw new IllegalArgumentException("Id isn't valid.");
        }
        this.id_token = id_token;
    }

    public void setPassengerStatus(PassengerStatus ps) {
        if (!Validator.checkPassengerStatus(ps.name())) {
            throw new IllegalArgumentException("Passenger status isn't valid");
        }
        this.passengerStatus = ps;
    }
}
