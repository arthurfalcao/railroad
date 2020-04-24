package main.java.pt.ipb.railroad.main;

import main.java.pt.ipb.railroad.RailwayNetwork;

public class RailroadApplication {

    public static void main(String[] args) {
        var railwayNetwork = new RailwayNetwork();

        railwayNetwork.addTrain("FL");
        railwayNetwork.addTrain("AF");
        railwayNetwork.addStation("LV", "Bragança");
        railwayNetwork.addStation("J5", "Lisboa");
        railwayNetwork.addStation("MA", "Maceió");

        railwayNetwork.addConnectionToStation("LV", "J5");
        railwayNetwork.addConnectionToStation("MA", "LV");

        railwayNetwork.crossTrainByStation("FL", "J5", 1, false);
        railwayNetwork.crossTrainByStation("AF", "LV", 2, true);
        railwayNetwork.crossTrainByStation("FL", "MA", 2, false);
        railwayNetwork.crossTrainByStation("FL", "LV", 3, true);


    }
}
