package stardust;

public class Validator {
    public static boolean checkPilotStatus(String pilotStatus){
        for (PilotStatus ps : PilotStatus.values() ) {
            if (ps.name().equals(pilotStatus)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkAirplaneType(String airplaneType) {
        for (AirplaneType type : AirplaneType.values() ) {
            if (type.name().equals(airplaneType)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIdType(String idType) {
        for (ID_Token id : ID_Token.values()) {
            if (id.name().equals(idType)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPassengerStatus(String passStat) {
        for (PassengerStatus ps : PassengerStatus.values() ) {
            if (ps.name().equals(passStat)){
                return true;
            }
        }
        return false;
    }
}

