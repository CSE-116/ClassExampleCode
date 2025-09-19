package topicx_weightedgraphs;

public class FlightDistance implements Cost<Flight>{
    public double cost(Flight flight){
        return flight.getDistance();
    }
}
