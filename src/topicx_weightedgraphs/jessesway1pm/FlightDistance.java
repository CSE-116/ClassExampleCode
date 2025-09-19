package topicx_weightedgraphs.jessesway1pm;

public class FlightDistance implements FlightData{

    @Override
    public double getData(Flight flight) {
        return flight.getDistance();
    }

}
