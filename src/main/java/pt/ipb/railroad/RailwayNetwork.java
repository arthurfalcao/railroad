package main.java.pt.ipb.railroad;

import java.util.TreeMap;

public class RailwayNetwork {

    private TreeMap<String, Station> stations;
    private TreeMap<String, Train> trains;

    public RailwayNetwork() {
        this.stations = new TreeMap<>();
        this.trains = new TreeMap<>();
    }

    public boolean addTrain(String acronym) {
        if (trains.containsKey(acronym)) return false;

        var train = new Train(acronym);
        trains.put(acronym, train);
        return true;
    }

    public boolean addStation(String acronym, String local) {
        if (stations.containsKey(acronym)) return false;

        var station = new Station(acronym, local);
        stations.put(acronym, station);
        return true;
    }

    public boolean addConnectionToStation(String stationAcronym, String stationAcronymOfConnection) {
        Station station = stations.get(stationAcronym);
        Station stationOfConnection = stations.get(stationAcronymOfConnection);

        if (station == null || stationOfConnection == null)
            return false;

        if (station.hasConnectionWith(stationOfConnection)) {
            return false;
        }

        return station.addConnection(stationOfConnection);
    }

    public boolean crossTrainByStation(String trainAcronym, String stationAcronym, int line, boolean stop) {
        Train train = trains.get(trainAcronym);
        Station station = stations.get(stationAcronym);

        if (train == null || station == null)
            return false;

        return train.passByStation(station, line, stop);
    }

    public String crossesStationToString(String acronym) {
        Station station = stations.get(acronym);

        if (station == null)
            return null;

        return station.passagesToString();
    }

    public String stopTrainToString(String acronym) {
        Train train = trains.get(acronym);

        if (train == null)
            return null;

        return train.lastStation().toString();
    }
}
