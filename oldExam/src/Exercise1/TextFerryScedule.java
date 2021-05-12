package Exercise1;

import java.util.ArrayList;

public class TextFerryScedule {
    public static void main(String[] args)
    {
        Harbor harbor1 = new Harbor("Zeus","Braila");
        Harbor harbor2 = new Harbor("Zeus2","Braila");
        Harbor harbor3 = new Harbor("Roterdam","Roterdam");
        Harbor harbor4 = new Harbor("Roterdam2","Roterdam");

        FerrySchedule ferrySchedule = new FerrySchedule();
        ferrySchedule.addDeparture("20/20/2020", new Route(harbor1,harbor2));
        ferrySchedule.addDeparture("20/20/2020", new Route(harbor3,harbor4));
        ferrySchedule.addDeparture("20/20/2020", new Route(harbor3,harbor2));

        for(int index=0;index<ferrySchedule.getDepartureCount();index++)
        System.out.println(ferrySchedule.getDeparture(index));

        ArrayList<Departure> departures = ferrySchedule.getDeparturesFrom(harbor3);

        for(int index=0;index<departures.size();index++)
        {
            System.out.println(departures.get(index));
        }

    }
}
