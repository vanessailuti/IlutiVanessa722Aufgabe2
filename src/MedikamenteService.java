package src;

import java.util.List;

public class MedikamenteService {
    MedikamenteRepository repo = new MedikamenteRepository();

    public MedikamenteService() {
        this.repo = new MedikamenteRepository();
    }

    public void addMedikamente(int id,String name, double preis, String krankheit) {
        repo.addMedikamente(new Medikamente(id, name, preis, krankheit));
    }

    public  void deleteMedikamente(int id) {
        repo.deleteMedikamente(id);
    }

    public void updateMedikamente(int id,String name, double preis, String krankheit) {
        Medikamente oldMed = repo.getMedikamenteById(id);
        oldMed.setName(name);
        oldMed.setPreis(preis);
        oldMed.setKrankheit(krankheit);
        repo.updateMedikamente(oldMed);
    }

    public List<Medikamente> getAllProducts() {
        return repo.getAllMedikamente();
    }

    public Medikamente getMedikamenteById(int id) {
        return repo.getMedikamenteById(id);
    }
}
