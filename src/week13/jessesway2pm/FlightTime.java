package week13.jessesway2pm;

public class FlightTime implements FlightData {

    @Override
    public double getData(Flight flight) {
        return flight.getTime();
    }
}
