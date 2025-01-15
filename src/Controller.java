package src;

import src.MedikamenteService;
import src.Patienten;
import src.PatientenService;

import java.util.List;

public class Controller {
    PatientenService patientenService;
    MedikamenteService medikamenteService;

    public Controller(PatientenService patientenService, MedikamenteService medikamenteService) {
        this.patientenService = patientenService;
        this.medikamenteService = medikamenteService;;
    }

    public void addPatienten(int patientenID, String name, Integer alter, String diagnose) {
        patientenService.addNewPatienten(patientenID, name, alter, diagnose);
    }

    public void addMedikamente(int id,String name, double preis, String krankheit) {
        medikamenteService.addMedikamente(id, name, preis, krankheit);
    }

    public void deletePatienten(int id) {
        patientenService.deletePatienten(id);
    }


    public void updatePatienten(int id, String name, Integer alter, String diagnose) {
        patientenService.updatePatienten(id, name, alter, diagnose);
    }

    public void updateMedikament(int id,String name, double preis, String krankheit) {
        medikamenteService.updateMedikamente(id,name,preis,krankheit);
    }

    public List<Patienten> getAllPatienten() {
        return patientenService.getAllPatienten();
    }

    public List<src.Medikamente> getAllMedikamente() {
        return MedikamenteService.getAllMedikamente();
    }
    public Patienten getCustByID(int id) {
        return patientenService.getPatientenByID(id);
    }

    public Medikamente getMedikamenteById(int id) {
        return src.MedikamenteService.getMedicamenteById(id);
    }

    public void sellItem(int patientenID, int medikamenteID){
        Medikamente soldProd = medikamenteService.getMedikamenteById(medikamenteID);
        Patienten pat = patientenService.getPatientenByID(patientenID);
        pat.addMedikamente(soldProd);
    }
}

