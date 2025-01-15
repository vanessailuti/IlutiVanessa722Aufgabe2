package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Repräsentiert ein Pateinten mit einer eindeutigen ID, einem Namen, einem Alter und einer zugehörigen Diagnose und eine Liste von Medikamenten.
 */

public class Patienten {
    private int patientenID;
    private String name;
    private Integer alter;
    private String diagnose;
    private List<Medikamente> medikamenten;

    /**
     * Erstellt ein neues {@code Patient}-Objekt mit einer ID, einem Namen,  einem Alter und einer zugehörigen Diagnose und eine Liste von Medikamenten.
     *
     * @param patientenID     Die eindeutige ID dem src.Patienten.
     * @param name   Der Name der src.Patienten.
     * @param alter  Der Alter der src.Patienten.
     * @param diagnose Die zugehörige Diagnose der src.Patienten.
     */


    public Patienten(int patientenID, String name, Integer alter, String diagnose) {
        this.patientenID = patientenID;
        this.name = name;
        this.alter = alter;
        this.diagnose = diagnose;
        this.medikamenten = new ArrayList<Medikamente>();
    }

    public int getPatientenID() {
        return patientenID;
    }

    public void setPatientenID(int patientenID) {
        this.patientenID = patientenID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAlter() {return alter;}

    public void setAlter(Integer alter) {this.alter = alter;}

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public List<Medikamente> getMedikamenten() {
        return medikamenten;
    }

    public void addProduct(Medikamente medikamente) {this.medikamenten.add(medikamente);
    }

    @Override
    public String toString() {
        return "src.Patienten{" +
                "patientenID=" + patientenID +
                ", name='" + name + '\'' +
                ", alter='" + alter + '\'' +
                ", diagnose='" + diagnose + '\'' +
                ", medikamente=" + medikamenten +
                '}';
    }
}

