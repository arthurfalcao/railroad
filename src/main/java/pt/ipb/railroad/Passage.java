package main.java.pt.ipb.railroad;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Passage {

    private int id;
    private Date datetime;
    private boolean withStop;
    private int line;
    private Station station;
    private Train train;

    public Passage(int id, boolean withStop, int line, Station station, Train train) {
        this.id = id;
        this.datetime = new Date();
        this.withStop = withStop;
        this.line = line;
        this.station = station;
        this.train = train;
    }

    public boolean hasStop() {
        return withStop;
    }

    public Station getStation() {
        return station;
    }

    @Override
    public String toString() {
        String hasStop;
        if (hasStop())
            hasStop = "stop";
        else
            hasStop = "do not stop";

        String formattedDate = (new SimpleDateFormat(" 'no dia' dd/MM/yyyy 'às' kk:mm:ss")).format(datetime);
        return "Train " + train.getAcronym() + " of line " + line + " passed by the station " + getStation().getLocation() + " and " + hasStop + formattedDate;
    }

}
