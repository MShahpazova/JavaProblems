package stardust;

import java.util.ArrayList;
import java.util.List;

public class Pilot extends Employee {
    private PilotStatus pilotStatus;
    private List<AirplaneType> planeTypes = new ArrayList<>();

    public Pilot(String name, String dateBirth, float salary, String id, String contractStart, PilotStatus pilotStatus) {
        super(name, dateBirth, salary, id, contractStart);
        setPilotStatus(pilotStatus);
    }

    public void setPilotStatus(PilotStatus pilotStatus) {
        if (!Validator.checkPilotStatus(pilotStatus.name())) {
            throw new IllegalArgumentException("Pilot status is not valid.");
        }
       this.pilotStatus = pilotStatus;
    }


    public Iterable<AirplaneType> getPlaneTypes() {
        return planeTypes;
    }

    public void addPlaneType(AirplaneType airplaneType) {
        if (!Validator.checkAirplaneType(airplaneType.name())) {
            throw new IllegalArgumentException("Plane type isn't valid");
        }
        planeTypes.add(airplaneType);
    }
}