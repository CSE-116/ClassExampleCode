package topicx_weightedgraphs.jessesway1pm;

public class FlightPrice implements FlightData{

    @Override
    public double getData(Flight flight) {
        return flight.getPrice();
    }

}
