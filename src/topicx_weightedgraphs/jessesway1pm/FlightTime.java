package topicx_weightedgraphs.jessesway1pm;

public class FlightTime implements FlightData{

    @Override
    public double getData(Flight flight) {
        return flight.getTime();
    }

}
