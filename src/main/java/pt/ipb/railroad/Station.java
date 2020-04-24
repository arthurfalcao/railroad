package main.java.pt.ipb.railroad;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Station {

    private String acronym;
    private String local;
    private LinkedList<Passage> passages;
    private List<Station> connections;

    public Station(String acronym, String local) {
        this.acronym = acronym;
        this.local = local;
        this.passages = new LinkedList<>();
        this.connections = new LinkedList<>();
    }

    public String getAcronym() {
        return acronym;
    }

    public String getLocation() {
        return local;
    }

    public boolean addConnection(Station station) {
        return connections.add(station);
    }

    public boolean hasConnectionWith(Station station) {
        AtomicBoolean hasConnection = new AtomicBoolean(false);

        connections.forEach(s -> {
            if (s.getAcronym().equals(station.getAcronym())) {
                hasConnection.set(true);
            }
        });

        return hasConnection.get();
    }

    public boolean addPassage(Passage passage) {
        return passages.add(passage);
    }

    //TODO
    public String passagesToString() {
        return "passages";
    }
}
