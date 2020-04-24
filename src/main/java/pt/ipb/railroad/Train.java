package main.java.pt.ipb.railroad;

import java.util.LinkedList;
import java.util.Queue;

public class Train {

    private String acronym;
    private LinkedList<Passage> passages;
    private Queue<Station> stations;

    public Train(String acronym) {
        this.acronym = acronym;
        this.passages = new LinkedList<>();
        this.stations = new LinkedList<>();
    }

    public String getAcronym() {
        return acronym;
    }

    public Station lastStation() {
        return stations.peek();
    }

    public boolean passByStation(Station station, int line, boolean stop) {
        int size = passages.size() + 1;

        var passage = new Passage(size, stop, line, station, this);

        passages.add(passage);
        if (!station.addPassage(passage)) {
            return false;
        }

        return stations.offer(station);
    }

    public String stopsToString() {
        return "stops";
    }
}
