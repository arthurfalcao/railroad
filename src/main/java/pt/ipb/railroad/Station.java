package main.java.pt.ipb.railroad;

public class Station {

    private String acronym;
    private String local;

    public Station(String acronym, String local) {
        this.acronym = acronym;
        this.local = local;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getLocation() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
