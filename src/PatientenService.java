package src;

import java.util.List;

public class PatientenService {
    PatientenRepository repo;

    public PatientenService() {this.repo = new PatientenRepository();}

    public void addNewPatienten(int patientenID, String name, Integer alter, String diagnose) {
        repo.addPatienten(new Patienten( patientenID, name, alter, diagnose));
    }

    public Patienten getPatientenByID(int id) {
        return repo.getPatientenById(id);
    }

    public void deletePatienten(int id) {
        repo.deletePatienten(id);
    }

    public void updatePatienten(int id, String name, Integer alter, String diagnose) {
        Patienten p = repo.getPatientenById(id);
        p.setName(name);
        p.setAlter(alter);
        p.setDiagnose(diagnose);
        repo.updatePatienten(p);
    }

    public List<Patienten> getAllPatienten() {
        return repo.getAllPatienten();
    }


}
