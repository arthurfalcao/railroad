package pt.ipb.railroad;

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
        return "Ticket{" +
                "id=" + id +
                ", datetime=" + datetime +
                ", hasStop=" + withStop +
                ", line='" + line + '\'' +
                ", station=" + station +
                ", train=" + train +
                '}';
    }
}
