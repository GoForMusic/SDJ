package Exercise1;

import java.util.ArrayList;

public class FerrySchedule {
    ArrayList<Departure> departures;
    public FerrySchedule()
    {
        departures = new ArrayList<Departure>();
    }
    public void addDeparture(String dayAndTime, Trip trip){
        departures.add(new Departure(dayAndTime, trip));
    }
    public int getDepartureCount()
    {
        return departures.size();
    }
    public Departure getDeparture(int index)
    {
        return departures.get(index);
    }

    public ArrayList<Departure> getDeparturesFrom(Harbor harbor)
    {
        ArrayList<Departure> localArray = new ArrayList<Departure>();

        for(Departure departure:departures)
        {
            if(departure.getFrom().equals(harbor)) localArray.add(departure);
        }

        return localArray;
    }
}
